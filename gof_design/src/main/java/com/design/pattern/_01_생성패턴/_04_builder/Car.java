package com.design.pattern._01_생성패턴._04_builder;

public class Car {

  private String model;
  private String color;
  private int year;
  private boolean sunroof;
  private boolean navigation;

  private Car(String model,
              String color,
              int year,
              boolean sunroof,
              boolean navigation) {
    this.model = model;
    this.color = color;
    this.year = year;
    this.sunroof = sunroof;
    this.navigation = navigation;
  }

  // CarBuilder 생성 정적 팩토리 메서드 (필수값이 필요한 경우 입력값을 받음)
  public static CarBuilder builder(String model, String color, int year) {
    return new CarBuilder(model, color, year); // 생성자에 필수값을 넣음
  }

  // 빌더 구현 클래서
  public static class CarBuilder {

    private String model;
    private String color;
    private int year;
    private boolean sunroof;
    private boolean navigation;

    // 필수값을 넣을 때 생성자에 추가하는 방식
    private CarBuilder(String model, String color, int year) {
      this.model = model;
      this.color = color;
      this.year = year;
    }

    public CarBuilder sunroof(boolean sunroof) {
      this.sunroof = sunroof;
      return this;
    }

    public CarBuilder navigation(boolean navigation) {
      this.navigation = navigation;
      return this;
    }

    public Car build() {
      // 필수로 넣어야 되는 경우 예외 로직을 넣을 수 있음
      if (model == null || year <= 0) {
        throw new IllegalArgumentException("Model and year are required");
      }
      return new Car(model, color, year, sunroof, navigation);
    }
  }

  @Override
  public String toString() {
    return "Car{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", year=" + year +
        ", sunroof=" + sunroof +
        ", navigation=" + navigation +
        '}';
  }
}
