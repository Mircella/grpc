// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: weather/weather.proto

package kz.mircella.grpc.weather;

public interface TemperatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:weather.Temperature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double degree = 1;</code>
   * @return The degree.
   */
  double getDegree();

  /**
   * <code>.weather.Temperature.Unit unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <code>.weather.Temperature.Unit unit = 2;</code>
   * @return The unit.
   */
  kz.mircella.grpc.weather.Temperature.Unit getUnit();
}
