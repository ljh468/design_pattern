package com.design.pattern.adapter.ducks;

import com.design.pattern.adapter.ducks.challenge.Drone;
import com.design.pattern.adapter.ducks.challenge.DroneAdapter;
import com.design.pattern.adapter.ducks.challenge.SuperDrone;

public class DuckTestDrive {
  public static void main(String[] args) {
    Duck duck = new MallardDuck();

    Turkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says...");
    testDuck(duck);

    System.out.println("\nThe TurkeyAdapter says...");
    testDuck(turkeyAdapter);

    // Challenge
    Drone drone = new SuperDrone();
    Duck droneAdapter = new DroneAdapter(drone);
    testDuck(droneAdapter);
  }

  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
