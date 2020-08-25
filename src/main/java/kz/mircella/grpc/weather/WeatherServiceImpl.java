package kz.mircella.grpc.weather;

import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class WeatherServiceImpl extends WeatherServiceGrpc.WeatherServiceImplBase {

    private static final Map<GeoLocation, WeatherResponse> weatherRepository = new ConcurrentHashMap<>();

    public WeatherServiceImpl() {
        IntStream.iterate(-500, i -> i += 100).limit(10).forEach(
                it -> {
                    GeoLocation geoLocation = new GeoLocation(it, it, it + 100, it + 100);
                    weatherRepository.put(geoLocation, randomWeatherResponse(geoLocation));
                }
        );
        System.out.println("Weather Repository is initialized with " + weatherRepository.keySet().size() + " geolocations");
    }

    @Override
    public void getWeatherStream(WeatherRequest request, StreamObserver<WeatherResponse> responseObserver) {
        int latitude = request.getLatitude();
        int longitude = request.getLongitude();
        try {
            IntStream.range(0, 10).boxed().forEach(it -> {
                        WeatherResponse weatherResponse = generateWeather(latitude, longitude);
                        responseObserver.onNext(weatherResponse);
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            );
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    // StreamObserver of requests is returned as client requests are asynchronous and we need to handle each request in a stream
    public StreamObserver<WeatherRequest> getWeather(StreamObserver<WeatherResponse> responseObserver) {
        return new StreamObserver<WeatherRequest>() {
            final List<WeatherResponse> weatherResponses = new ArrayList<>();

            @Override
            public void onNext(WeatherRequest request) {
                // client sends request
                int latitude = request.getLatitude();
                int longitude = request.getLongitude();
                try {
                    WeatherResponse weatherResponse = generateWeather(latitude, longitude);
                    weatherResponses.add(weatherResponse);
                } catch (Exception e) {
                    responseObserver.onError(Status.INVALID_ARGUMENT
                            .withDescription("Invalid geolocation")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException());
                }
            }

            @Override
            public void onError(Throwable t) {
                // client sends error
                System.out.println("Error:" + t.getLocalizedMessage());
            }

            @Override
            public void onCompleted() {
                // client is done
                responseObserver.onNext(calculateAverageWeather(weatherResponses));
                // and response is returned
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<WeatherRequest> generateWeathers(StreamObserver<WeatherResponse> responseObserver) {
        return new StreamObserver<WeatherRequest>() {
            @Override
            public void onNext(WeatherRequest request) {
                // after receiving each request, response is returned
                responseObserver.onNext(generateWeather(request.getLatitude(), request.getLongitude()));
            }

            @Override
            public void onError(Throwable t) {
                // client sends error
                System.out.println("Error:" + t.getLocalizedMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getWeatherWithDeadline(WeatherRequest request, StreamObserver<WeatherResponse> responseObserver) {
        // Context is an object within RPC
        Context context = Context.current();
        // simulation of complex weather calculation
        for (int i = 0; i < 3; i++) {
            try {
                // checking deadline was not exceeded
                if (!context.isCancelled()) {
                    Thread.sleep(1000);
                } else {
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // returning calculated weather
        responseObserver.onNext(generateWeather(request.getLatitude(), request.getLongitude()));
        responseObserver.onCompleted();
    }

    private WeatherResponse calculateAverageWeather(List<WeatherResponse> weatherResponses) {
        Optional<WeatherResponse> averageWeather = weatherResponses.stream().reduce(new BinaryOperator<WeatherResponse>() {
            @Override
            public WeatherResponse apply(WeatherResponse first, WeatherResponse second) {
                double temperatureValue = first.getTemperature().getDegree() + second.getTemperature().getDegree();
                Temperature temperature = Temperature.newBuilder().setDegree(temperatureValue).build();

                double humidityValue = first.getHumidity().getPercentage() + second.getHumidity().getPercentage();
                Humidity humidity = Humidity.newBuilder().setPercentage(humidityValue).build();
                return WeatherResponse.newBuilder().setTemperature(temperature).setHumidity(humidity).build();
            }
        }).map(it -> {
            Humidity averageHumidity = Humidity.newBuilder().setPercentage(it.getHumidity().getPercentage() / weatherResponses.size()).build();
            Temperature averageTemperature = Temperature.newBuilder().setDegree(it.getTemperature().getDegree() / weatherResponses.size()).build();
            return WeatherResponse.newBuilder().setHumidity(averageHumidity).setTemperature(averageTemperature).build();
        });
        return averageWeather.orElse(null);
    }

    private WeatherResponse generateWeather(int latitude, int longitude) {
        GeoLocation geoLocation = weatherRepository.keySet()
                .stream()
                .filter(it -> it.includes(latitude, longitude))
                .findAny()
                .orElseThrow(() -> new GeoLocationNotFound(latitude, longitude));
        return weatherRepository.get(geoLocation);
    }

    private WeatherResponse randomWeatherResponse(GeoLocation geoLocation) {
        double humidityPercentage = BigDecimal.valueOf(RandomUtils.nextDouble(0, 100)).round(new MathContext(2, RoundingMode.DOWN)).doubleValue();
        Humidity humidity = Humidity.newBuilder().setPercentage(humidityPercentage).build();
        double temperatureValue = RandomUtils.nextInt(0, 50);
        Temperature temperature = Temperature.newBuilder().setDegree(temperatureValue).setUnit(Temperature.Unit.CELSIUS).build();
        return WeatherResponse.newBuilder().setHumidity(humidity).setTemperature(temperature).build();
    }

    private static class GeoLocation {

        private static final int DEFAULT_DISTANCE = 100;

        private final int startLatitude;
        private final int startLongitude;
        private final int endLatitude;
        private final int endLongitude;

        public GeoLocation(int startLatitude, int startLongitude, int endLatitude, int endLongitude) {
            this.startLatitude = startLatitude;
            this.startLongitude = startLongitude;
            this.endLatitude = endLatitude;
            this.endLongitude = endLongitude;
        }

        public static GeoLocation includingWithDefaultDistance(int latitude, int longitude) {
            int startLatitude = latitude - (latitude % DEFAULT_DISTANCE);
            int endLatitude = startLatitude + DEFAULT_DISTANCE;
            int startLongitude = longitude - (longitude % DEFAULT_DISTANCE);
            int endLongitude = startLongitude + DEFAULT_DISTANCE;
            return new GeoLocation(startLatitude, startLongitude, endLatitude, endLongitude);
        }

        public static GeoLocation including(int latitude, int longitude, int distance) {
            int startLatitude = latitude - (latitude % distance);
            int endLatitude = startLatitude + distance;
            int startLongitude = longitude - (longitude % distance);
            int endLongitude = startLongitude + distance;
            return new GeoLocation(startLatitude, startLongitude, endLatitude, endLongitude);
        }

        public boolean includes(int latitude, int longitude) {
            boolean isLatitudeWithin = IntStream.range(startLatitude, endLatitude).anyMatch(it -> it == latitude);
            boolean isLongitudeWithin = IntStream.range(startLongitude, endLongitude).anyMatch(it -> it == longitude);
            return isLatitudeWithin && isLongitudeWithin;
        }
    }
}
