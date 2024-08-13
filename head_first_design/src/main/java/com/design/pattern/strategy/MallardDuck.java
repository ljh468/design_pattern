package com.design.pattern.strategy;

// 날 수 있고, 꽥소리를 내는 MallardDuck (청둥오리)
public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
