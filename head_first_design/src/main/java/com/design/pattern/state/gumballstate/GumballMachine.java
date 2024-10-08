package com.design.pattern.state.gumballstate;

public class GumballMachine {

  State soldOutState;

  State noQuarterState;

  State hasQuarterState;

  State soldState;

  State currentState;

  int count = 0;

  public GumballMachine(int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
      currentState = noQuarterState;
    } else {
      currentState = soldOutState;
    }
  }

  public void insertQuarter() {
    currentState.insertQuarter();
  }

  public void ejectQuarter() {
    currentState.ejectQuarter();
  }

  public void turnCrank() {
    currentState.turnCrank();
    currentState.dispense();
  }

  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count > 0) {
      count = count - 1;
    }
  }

  int getCount() {
    return count;
  }

  void refill(int count) {
    this.count += count;
    System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
    currentState.refill();
  }

  void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  public State getCurrentState() {
    return currentState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is " + currentState + "\n");
    return result.toString();
  }
}
