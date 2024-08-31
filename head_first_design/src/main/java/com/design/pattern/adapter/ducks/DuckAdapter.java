package com.design.pattern.adapter.ducks;

import java.util.Random;

// 어댑터 객체
public class DuckAdapter implements Turkey {
  // Adaptee를 참조
  Duck duck;
  Random rand;

  public DuckAdapter(Duck duck) {
    this.duck = duck;
    rand = new Random();
  }

  public void gobble() {
    duck.quack();
  }

  public void fly() {
    if (rand.nextInt(5) == 0) {
      duck.fly();
    }
  }
}
