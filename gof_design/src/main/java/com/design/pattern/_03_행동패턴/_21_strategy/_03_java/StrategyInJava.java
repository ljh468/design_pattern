package com.design.pattern._03_행동패턴._21_strategy._03_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyInJava {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(5);

    System.out.println(numbers);

    // 새로운 익명객체를 넣어주는 방식으로 활용
    Collections.sort(numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });

    // static 메서드를 이용하여 내림차순 정렬
    // static final ReverseComparator REVERSE_ORDER = new ReverseComparator(); 객체를 넣어줌
    Collections.sort(numbers, Comparator.reverseOrder());

    System.out.println(numbers);
  }
}
