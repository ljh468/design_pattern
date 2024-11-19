package com.design.pattern._01_생성패턴._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {

  public static void main(String[] args) {
    Stream.Builder<String> stringStreamBuilder = Stream.builder();
    Stream<String> names = stringStreamBuilder.add("jaehoon")
                                              .add("noah")
                                              .build();
    // 제네릭을 활용해서 이렇게 작성할 수도 있음
    Stream<String> names2 = Stream.<String>builder()
                                  .add("jaehoon")
                                  .add("noah")
                                  .build();

    names.forEach(System.out::println);
    names2.forEach(System.out::println);
  }
}
