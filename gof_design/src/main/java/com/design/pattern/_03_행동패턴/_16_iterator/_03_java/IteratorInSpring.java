package com.design.pattern._03_행동패턴._16_iterator._03_java;

import org.springframework.util.CompositeIterator;

import java.util.*;

public class IteratorInSpring {

  public static void main(String[] args) {
    /**
     * 스프링은 CompositeIterator 제공
     * 여러 타입의 Iterator들을 사용할 수 있게 Composite이 적용됨
     */

    // 해시 셋 자료구조
    Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
    // 어레이 리스트 자료구조
    List<String> list = new ArrayList<>(Arrays.asList("D", "E", "F"));

    // 각 자료구조에서 Iterator를 가져옴
    Iterator<String> iterator1 = set.iterator();
    Iterator<String> iterator2 = list.iterator();

    // CompositeIterator 생성
    CompositeIterator compositeIterator = new CompositeIterator();
    compositeIterator.add(iterator1); // 첫 번째 Iterator 추가
    compositeIterator.add(iterator2); // 두 번째 Iterator 추가

    // CompositeIterator를 통해 순회
    while (compositeIterator.hasNext()) {
      System.out.println(compositeIterator.next());
    }
  }
}
