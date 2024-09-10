package com.design.pattern.state.gumballstatewinner;

import java.util.Random;

public class HasQuarterState implements State {

  Random randomWinner = new Random(System.currentTimeMillis());

  GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("You can't insert another quarter");
  }

  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
  }

  public void turnCrank() {
    System.out.println("You turned...");
    int s = (int)(Math.random() * 10) + 1;
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setCurrentState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }
  }

  public void dispense() {
    System.out.println("No gumball dispensed");
  }

  public void refill() {
  }

  public String toString() {
    return "waiting for turn of crank";
  }
}
