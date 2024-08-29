package com.design.pattern._01_생성패턴._01_singleton;

/**
 * private 생성자와 public static 메소드를 사용하는 방법
 */
public class Singleton1 {

  // 밖에서 인스턴스를 생성하지 못하게 private 생성자
  private static Singleton1 instance;

  private Singleton1() {
  }

  // 이방법은 멀티스레드 환경에서 문제가 발생한다. (인스턴스가 2개 생길수 있음)
  public static Singleton1 getInstance() {
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }

}
