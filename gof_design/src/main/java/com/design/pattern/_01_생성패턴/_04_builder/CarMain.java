package com.design.pattern._01_생성패턴._04_builder;

public class CarMain {

  public static void main(String[] args) {
    Car car = Car.builder("jeep", "검은색", 2024)
                 .sunroof(true)
                 .navigation(true)
                 .build();
    System.out.println("car = " + car);
  }
}
