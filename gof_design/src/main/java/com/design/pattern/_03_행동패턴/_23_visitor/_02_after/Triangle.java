package com.design.pattern._03_행동패턴._23_visitor._02_after;

public class Triangle implements Shape {

  @Override
  public void accept(Device device) {
    device.print(this);
  }
}
