package com.design.pattern._03_행동패턴._23_visitor._01_before;

public class Client {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    Device device = new Phone();
    rectangle.printTo(device);
  }
}
