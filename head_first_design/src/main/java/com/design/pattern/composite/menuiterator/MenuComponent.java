package com.design.pattern.composite.menuiterator;

import java.util.Iterator;

// 상속하는 클래스에서 구현 할 수 있도록 UnsupportedOperationException 처리
public abstract class MenuComponent {

  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public MenuComponent getChild(int i) {
    throw new UnsupportedOperationException();
  }

  public String getName() {
    throw new UnsupportedOperationException();
  }

  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  public abstract Iterator<MenuComponent> createIterator();

  public void print() {
    throw new UnsupportedOperationException();
  }

}
