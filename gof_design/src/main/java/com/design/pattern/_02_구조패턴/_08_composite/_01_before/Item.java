package com.design.pattern._02_구조패턴._08_composite._01_before;

public class Item {

  private String name;

  private int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }
}
