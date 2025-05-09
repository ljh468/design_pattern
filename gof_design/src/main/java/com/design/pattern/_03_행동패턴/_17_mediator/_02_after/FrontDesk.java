package com.design.pattern._03_행동패턴._17_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {

  private CleaningService cleaningService = new CleaningService();

  private Restaurant restaurant = new Restaurant();

  public void getTowers(Guest guest, int numberOfTowers) {
    cleaningService.getTowers(guest.getId(), numberOfTowers);
  }

  public void dinner(Guest guest, LocalDateTime dateTime) {
    restaurant.dinner(guest.getId(), dateTime);
  }
}
