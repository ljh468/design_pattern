package com.design.pattern.strategy;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
