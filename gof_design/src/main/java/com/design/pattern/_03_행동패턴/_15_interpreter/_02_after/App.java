package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Map;

public class App {

  public static void main(String[] args) {
    PostfixExpression expression = PostfixParser.parse("xyz+-a+");
    int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
    System.out.println(result);
  }
}
