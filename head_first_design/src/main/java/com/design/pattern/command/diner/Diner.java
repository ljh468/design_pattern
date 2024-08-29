package com.design.pattern.command.diner;

public class Diner {
  public static void main(String[] args) {
    Cook cook = new Cook(); // 리시버 생성
    Waitress waitress = new Waitress(); // 요청 전달자

    Customer customer = new Customer(waitress); // 인보커 생성

    BurgerAndFriesOrder order = new BurgerAndFriesOrder(cook); // 리시버를 담은 커맨드 생성
    customer.createOrder(order); // 인보커에 커맨드 담기
    customer.hungry(); // 종업원에 주문 요청 (인보커 실행)
  }
}