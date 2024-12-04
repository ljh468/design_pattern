package com.design.pattern._03_행동패턴._17_mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

  public void dinner(Integer guestId, LocalDateTime dateTime) {
    System.out.println(guestId + " has dinner at " + dateTime);
  }
}
