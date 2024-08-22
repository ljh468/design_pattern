package com.design.pattern._03_행동패턴._19_observer._03_java;

public class MyEvent {

  private String message;

  public MyEvent(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
