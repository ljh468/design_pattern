package com.design.pattern.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;

	private float minTemp = 200;

	private float tempSum= 0.0f;

	private int numReadings;

	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		// weatherData로 부터 pull해서 데이터를 가공
		tempSum += weatherData.getTemperature();
		numReadings++;

		if (weatherData.getTemperature() > maxTemp) {
			maxTemp = weatherData.getTemperature();
		}
 
		if (weatherData.getTemperature() < minTemp) {
			minTemp = weatherData.getTemperature();
		}
		display();
	}

	public void display() {
		log.info("평균/최고/최저 온도 = {}, {}, {}", (tempSum / numReadings), maxTemp, minTemp);
	}
}
