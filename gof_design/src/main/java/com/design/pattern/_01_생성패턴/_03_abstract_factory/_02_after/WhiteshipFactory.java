package com.design.pattern._01_생성패턴._03_abstract_factory._02_after;


import com.design.pattern._01_생성패턴._02_factory_method._02_after.DefaultShipFactory;
import com.design.pattern._01_생성패턴._02_factory_method._02_after.Ship;
import com.design.pattern._01_생성패턴._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

  private ShipPartsFactory shipPartsFactory;

  public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
    this.shipPartsFactory = shipPartsFactory;
  }

  @Override
  public Ship createShip() {
    Ship ship = new Whiteship();
    ship.setAnchor(shipPartsFactory.createAnchor());
    ship.setWheel(shipPartsFactory.createWheel());
    return ship;
  }
}
