package kz.mircella.grpc.weather;

import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class WeatherServiceImpl extends WeatherServiceGrpc.WeatherServiceImplBase {

    private static Map<GeoLocation, WeatherResponse> weatherRepository = new ConcurrentHashMap<>();

    public WeatherServiceImpl() {
        GeoLocation geoLocation = new GeoLocation(0, 0, 100, 100);
        weatherRepository.put(geoLocation, randomWeatherResponse(geoLocation));
    }

    @Override
    public void getWeather(WeatherRequest request, StreamObserver<WeatherResponse> responseObserver) {
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

    private WeatherResponse generateWeather(int latitude, int longitude) {
        GeoLocation geoLocation = weatherRepository.keySet()
                .stream()
                .filter(it -> it.includes(latitude, longitude))
                .findAny()
                .orElseGet(() -> GeoLocation.includingWithDefaultDistance(latitude, longitude));
        WeatherResponse randomWeatherResponse = randomWeatherResponse(geoLocation);
        weatherRepository.put(geoLocation, randomWeatherResponse);
        return randomWeatherResponse;
    }

    private WeatherResponse randomWeatherResponse(GeoLocation location) {
        double humidityPercentage = BigDecimal.valueOf(Math.abs(RandomUtils.nextDouble(location.startLongitude, location.endLongitude)))
                .divide(new BigDecimal(location.endLongitude), new MathContext(2, RoundingMode.DOWN))
                .multiply(new BigDecimal(100)).doubleValue();
        Humidity humidity = Humidity.newBuilder().setPercentage(humidityPercentage).build();
        int temperatureValue = RandomUtils.nextInt(location.startLatitude, location.endLatitude);
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
