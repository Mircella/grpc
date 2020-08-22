package kz.mircella.grpc.weather;

public class GeoLocationNotFound extends RuntimeException {

    public GeoLocationNotFound(int latitude, int longitude) {
        super("GeoLocation with coordinates:(" + latitude + "," + longitude + ") not found");
    }
}
