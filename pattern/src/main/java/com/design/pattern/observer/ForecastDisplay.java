package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

  private float currentPressure = 29.92f;

  private float lastPressure;

  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update() {
    lastPressure = currentPressure;
    currentPressure = weatherData.getPressure();
    display();
  }

  public void display() {
    if (currentPressure > lastPressure) {
      log.info("기상 예보 : 날씨가 좋아지고 있습니다.!");
    } else if (currentPressure == lastPressure) {
      log.info("기상 예보 : 지금과 비슷할 것 같습니다.!");
    } else if (currentPressure < lastPressure) {
      log.info("기상 예보 : 쌀쌀하며 비가 올 것 같습니다.");
    }
  }
}
