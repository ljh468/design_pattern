package com.design.pattern.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

// 주제 객체, 상태값이 변경되면 observer들에게 알림
@Getter
public class WeatherData implements Subject {

  private List<Observer> observers;

  private float temperature;

  private float humidity;

  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  // 기상 스테이션으로부터 갱신된 측정값을 받으면 옵저버들에게 알림
  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  // TODO: 기타 WeatherData 메서드 추가
}
