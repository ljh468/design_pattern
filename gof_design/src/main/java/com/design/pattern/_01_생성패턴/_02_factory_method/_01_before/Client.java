package com.design.pattern._01_생성패턴._02_factory_method._01_before;

public class Client {

  public static void main(String[] args) {
    Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
    System.out.println(whiteship);

    Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
    System.out.println(blackship);
  }

}
