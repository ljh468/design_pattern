package com.design.pattern._01_생성패턴._02_factory_method._02_after;

public class Client {

  public static void main(String[] args) {
    Client client = new Client();
    client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
    client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
  }

  // 인터페이스 기반으로 ShipFactory를 의존성주입을 해준다고 가정
  private void print(ShipFactory shipFactory, String name, String email) {
    System.out.println(shipFactory.orderShip(name, email));
  }

}
