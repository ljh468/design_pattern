package com.design.pattern._01_생성패턴._02_factory_method._02_after;

public class WhiteshipFactory extends DefaultShipFactory {

  @Override
  public Ship createShip() {
    return new Whiteship();
  }
}
