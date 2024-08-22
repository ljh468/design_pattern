package com.design.pattern._03_행동패턴._21_strategy._02_after;

public class Fastest implements Speed {

  @Override
  public void blueLight() {
    System.out.println("무광꽃이");
  }

  @Override
  public void redLight() {
    System.out.println("피어씀다.");
  }

}
