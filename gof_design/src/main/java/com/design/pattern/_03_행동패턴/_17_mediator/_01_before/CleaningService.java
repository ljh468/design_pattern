package com.design.pattern._03_행동패턴._17_mediator._01_before;

public class CleaningService {

  public void clean(Gym gym) {
    System.out.println("clean " + gym);
  }

  public void getTower(Guest guest, int numberOfTower) {
    System.out.println(numberOfTower + " towers to " + guest);
  }

  public void clean(Restaurant restaurant) {
    System.out.println("clean " + restaurant);
  }
}
