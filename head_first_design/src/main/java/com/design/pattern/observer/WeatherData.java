package com.design.pattern.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

// 주제 객체, 상태값이 변경되면 observer들에게 알림
@Getter
public class WeatherData implements Subject {

  private List<Observer> observers;

  private float temperature; // 온도

  private float humidity; // 습도

  private float pressure; // 기압

  public WeatherData() {
    observers = new ArrayList<>();
  }

  // Observer 등록
  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  // Observer 제거
  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  // Observer들에게 알리면 Observer 인터페이스를 이용해서 update
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
