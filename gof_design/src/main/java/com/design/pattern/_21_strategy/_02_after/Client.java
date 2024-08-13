package com.design.pattern._21_strategy._02_after;

public class Client {

  public static void main(String[] args) {
    BlueLightRedLight game = new BlueLightRedLight();
    // set을 이용해서 전략을 설정
    game.setSpeed(new Normal());
    game.blueLight();
    game.redLight();
    // 무 궁 화    꽃   이
    // 피 었 습 니  다.

    game.setSpeed(new Fastest());
    game.blueLight();
    game.redLight();
    // 무광꽃이
    // 피어씀다.

    game.setSpeed(new Speed() {
      @Override
      public void blueLight() {
        System.out.println("blue light");
      }

      @Override
      public void redLight() {
        System.out.println("red light");
      }
    });
    game.blueLight();
    game.redLight();
    // blue light
    // red light
  }
}
