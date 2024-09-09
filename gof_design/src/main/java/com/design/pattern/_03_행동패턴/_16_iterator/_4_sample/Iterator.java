package com.design.pattern._03_행동패턴._16_iterator._4_sample;

// 반복자 인터페이스
public interface Iterator<T> {

  boolean hasNext();

  T next();

}
