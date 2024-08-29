package com.design.pattern.command.dinerLambda;

public class Waitress {

  Order order;

  public Waitress() {
  }

  public void takeOrder(Order order) {
    this.order = order;
    order.orderUp();
  }
}