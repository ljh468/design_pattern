package com.design.pattern.strategy;

// 날 수 있고, 꽥소리를 내는 RedHeadDuck (빨간머리 오리)
public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
