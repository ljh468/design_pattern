package com.design.pattern._01_생성패턴._03_abstract_factory._02_after;

import com.design.pattern._01_생성패턴._02_factory_method._02_after.Ship;
import com.design.pattern._01_생성패턴._02_factory_method._02_after.ShipFactory;

public class ShipInventory {

  public static void main(String[] args) {
    ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
    Ship ship = shipFactory.createShip();
    System.out.println(ship.getAnchor().getClass());
    System.out.println(ship.getWheel().getClass());
  }
}
