package com.design.pattern.command.dinerLambda;

public class Customer {

  Waitress waitress;

  Cook cook;

  Order order;

  public Customer(Waitress waitress, Cook cook) {
    this.waitress = waitress;
    this.cook = cook;
  }

  public void createOrder() {
    // Order 인터페이스의 orderUp() 메서드를 구현
    this.order = () -> {
      this.cook.makeBurger();
      this.cook.makeFries();
    };
  }

  public void hungry() {
    waitress.takeOrder(order);
  }

}