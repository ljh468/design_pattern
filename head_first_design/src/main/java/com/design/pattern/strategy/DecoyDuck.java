package com.design.pattern.strategy;

// 오리를 꼬시는 DecoyDuck
public class DecoyDuck extends Duck {

	public DecoyDuck() {
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new MuteQuack());
  }

  public void display() {
    System.out.println("I'm a duck Decoy");
  }

}
