package com.design.pattern._03_행동패턴._19_observer._02_after;

// 옵저버 인터페이스
public interface Subscriber {

  void handleMessage(String message);
}
