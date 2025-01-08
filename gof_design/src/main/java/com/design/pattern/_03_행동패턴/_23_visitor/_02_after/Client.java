package com.design.pattern._03_행동패턴._23_visitor._02_after;

public class Client {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    Device device = new Pad();
    // rectangle.printTo(device) - 구체적인 타입이 아니어서 컴파일 에러
    rectangle.accept(device);
  }
}
