package com.design.pattern._03_행동패턴._23_visitor._01_before;

public class Triangle implements Shape {

  @Override
  public void printTo(Device device) {
    if (device instanceof Phone) {
      System.out.println("print Triangle to Phone");
    } else if (device instanceof Watch) {
      System.out.println("print Triangle to Watch");
    }
  }

}
