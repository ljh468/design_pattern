package com.design.pattern._03_행동패턴._16_iterator._4_sample;

public class IteratorPatternExample {
  public static void main(String[] args) {
    String[] names = {"김성균", "한효주", "김도훈", "양동근"};
    NameCollection nameCollection = new NameCollection(names);

    // 반복자 사용
    Iterator<String> iterator = nameCollection.iterator();
    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println("Name: " + name);
      // 출력 결과:
      // Name: 김성균
      // Name: 한효주
      // Name: 김도훈
      // Name: 양동근
    }
  }
}

