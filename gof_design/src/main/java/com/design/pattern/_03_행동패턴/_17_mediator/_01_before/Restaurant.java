package com.design.pattern._03_행동패턴._17_mediator._01_before;

public class Restaurant {

  private CleaningService cleaningService = new CleaningService();

  public void dinner(Guest guest) {
    System.out.println("dinner " + guest);
  }

  public void clean() {
    cleaningService.clean(this);
  }
}
