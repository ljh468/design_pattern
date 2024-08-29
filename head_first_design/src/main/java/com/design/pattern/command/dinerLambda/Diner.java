package com.design.pattern.command.dinerLambda;

public class Diner {
  public static void main(String[] args) {
    Cook cook = new Cook(); // 리시버 생성1
    Waitress waitress = new Waitress(); // 리시버 생성2

    Customer customer = new Customer(waitress, cook); // 인보커 생성
    customer.createOrder();
    customer.hungry();
  }
}