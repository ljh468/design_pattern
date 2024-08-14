package com.design.pattern._19_observer._02_after;

// 옵저버 인터페이스의 구현체
public class User implements Subscriber {

  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void handleMessage(String message) {
    System.out.println("(" + name + " received message) " + message);
  }
}
