package com.design.pattern._21_strategy._02_after;

public class BlueLightRedLight {

  private Speed speed;

  public Speed getSpeed() {
    return speed;
  }

  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  public void blueLight() {
    this.speed.blueLight();
  }

  public void redLight() {
    this.speed.redLight();
  }

}
