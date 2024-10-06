package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Map;

public class App {

  public static void main(String[] args) {
    // 우리가 정의한 문법의 구조로 변환
    PostfixExpression expression = PostfixParser.parse("xyz+-");

    // 인터프리터 (매개변수를 맵으로 추가)
    int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
    System.out.println(result);
  }
}
