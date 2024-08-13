package com.design.pattern.strategy;

// 날 수 없고, 꽥소리를 내는 ModelDuck
public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
