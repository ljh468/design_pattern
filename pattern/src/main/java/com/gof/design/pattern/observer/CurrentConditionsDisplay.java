package com.gof.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;

  private float humidity;

  // 주제객체를 저장해 놓으면 나중에 옵저버 목목에서 탈퇴할 때 유용하게 사용할 수 있음
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    log.info("현재 상태 : 온도 {}F, 습도 {}% ", temperature, humidity);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

}
