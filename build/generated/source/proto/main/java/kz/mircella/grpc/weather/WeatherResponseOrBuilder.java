// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: weather/weather.proto

package kz.mircella.grpc.weather;

public interface WeatherResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:weather.WeatherResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.weather.Temperature temperature = 1;</code>
   * @return Whether the temperature field is set.
   */
  boolean hasTemperature();
  /**
   * <code>.weather.Temperature temperature = 1;</code>
   * @return The temperature.
   */
  kz.mircella.grpc.weather.Temperature getTemperature();
  /**
   * <code>.weather.Temperature temperature = 1;</code>
   */
  kz.mircella.grpc.weather.TemperatureOrBuilder getTemperatureOrBuilder();

  /**
   * <code>.weather.Humidity humidity = 2;</code>
   * @return Whether the humidity field is set.
   */
  boolean hasHumidity();
  /**
   * <code>.weather.Humidity humidity = 2;</code>
   * @return The humidity.
   */
  kz.mircella.grpc.weather.Humidity getHumidity();
  /**
   * <code>.weather.Humidity humidity = 2;</code>
   */
  kz.mircella.grpc.weather.HumidityOrBuilder getHumidityOrBuilder();
}
