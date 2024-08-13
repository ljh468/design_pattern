package com.design.pattern.strategy;

// 가짜 꽥소리
public class FakeQuack implements QuackBehavior {

  public void quack() {
    System.out.println("Qwak");
  }

}
