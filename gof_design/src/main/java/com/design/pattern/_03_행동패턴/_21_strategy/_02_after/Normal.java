package com.design.pattern._03_행동패턴._21_strategy._02_after;

public class Normal implements Speed {

  @Override
  public void blueLight() {
    System.out.println("무 궁 화    꽃   이");
  }

  @Override
  public void redLight() {
    System.out.println("피 었 습 니  다.");
  }

}
