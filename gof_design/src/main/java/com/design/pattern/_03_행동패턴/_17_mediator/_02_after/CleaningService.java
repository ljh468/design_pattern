package com.design.pattern._03_행동패턴._17_mediator._02_after;

public class CleaningService {

  private FrontDesk frontDesk = new FrontDesk();

  public void getTowers(Integer guestId, int numberOfTowers) {
    String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
    System.out.println("provide " + numberOfTowers + " to " + roomNumber);
  }
}
