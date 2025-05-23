package com.design.pattern._03_행동패턴._23_visitor._01_before;

public class Circle implements Shape {

  @Override
  public void printTo(Device device) {
    if (device instanceof Phone) {
      System.out.println("print Circle to phone");
    } else if (device instanceof Watch) {
      System.out.println("print Circle to watch");
    }
  }
}
