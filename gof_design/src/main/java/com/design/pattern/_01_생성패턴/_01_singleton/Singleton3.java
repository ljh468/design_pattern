package com.design.pattern._01_생성패턴._01_singleton;

/**
 * double checked locking
 */
public class Singleton3 {

  // volatile는 메인 메모리에서 가져오게함
  private static volatile Singleton3 instance;

  private Singleton3() {
  }

  public static Singleton3 getInstance() {
    if (instance == null) {
      synchronized (Singleton3.class) {
        if (instance == null) {
          instance = new Singleton3();
        }
      }
    }

    return instance;
  }

}
