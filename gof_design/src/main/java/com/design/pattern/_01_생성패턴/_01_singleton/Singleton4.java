package com.design.pattern._01_생성패턴._01_singleton;

/**
 * static inner 클래스 홀더
 */
public class Singleton4 {

  private Singleton4() {
  }

  private static class SingletonHolder {
    private static final Singleton4 INSTANCE = new Singleton4();
  }

  public static Singleton4 getInstance() {
    return SingletonHolder.INSTANCE;
  }

}
