package com.design.pattern.strategy;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); // 로켓 추진체 날개 담
		model.performFly();

	}
}
