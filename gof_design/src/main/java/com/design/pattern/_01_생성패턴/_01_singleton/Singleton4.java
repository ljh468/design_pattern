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

  // 역직렬화 시 readResolve 메서드를 꼭 호출하게 됨 (역직렬화 대응)
  // protected Object readResolve() {
  //   return getInstance();
  // }
}
