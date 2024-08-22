package com.design.pattern._01_생성패턴._03_abstract_factory._01_before;


import com.design.pattern._01_생성패턴._02_factory_method._02_after.DefaultShipFactory;
import com.design.pattern._01_생성패턴._02_factory_method._02_after.Ship;
import com.design.pattern._01_생성패턴._02_factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

  @Override
  public Ship createShip() {
    Ship ship = new Whiteship();
    ship.setAnchor(new WhiteAnchor());
    ship.setWheel(new WhiteWheel());
    return ship;
  }
}
