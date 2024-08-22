package com.design.pattern._03_행동패턴._21_strategy._01_before;

public class Client {

  public static void main(String[] args) {
    BlueLightRedLight blueLightRedLight = new BlueLightRedLight(3);
    blueLightRedLight.blueLight();
    blueLightRedLight.redLight();
  }
}
