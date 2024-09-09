package com.design.pattern._03_행동패턴._16_iterator._4_sample;

// 집합체 인터페이스 (Iterable)
public interface IterableCollection<T> {

  Iterator<T> iterator();

}
