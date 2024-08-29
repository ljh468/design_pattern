package com.design.pattern._01_생성패턴._01_singleton;

/**
 * synchronized 사용해서 동기화 처리
 */
public class Singleton2 {

  private static Singleton2 instance;

  private Singleton2() {
  }

  // synchronized 키워드를 통해 메서드를 동기화 (성능저하가 생길 수 있음)
  public static synchronized Singleton2 getInstance() {
    if (instance == null) {
      instance = new Singleton2();
    }

    return instance;
  }

}
