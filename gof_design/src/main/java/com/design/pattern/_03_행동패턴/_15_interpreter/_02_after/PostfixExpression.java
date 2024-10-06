package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {

  int interpret(Map<Character, Integer> context);

  // static 메서드를 이용해서 함축적으로 Expression 구현체를 만들수도 있음
  // PlusExpression 대체
  static PostfixExpression plus(PostfixExpression left, PostfixExpression right) {
    return context -> left.interpret(context) + right.interpret(context);
  }

  // MinusExpression 대체
  static PostfixExpression minus(PostfixExpression left, PostfixExpression right) {
    return context -> left.interpret(context) - right.interpret(context);
  }

  // MultiplyExpression 대체
  static PostfixExpression multiply(PostfixExpression left, PostfixExpression right) {
    return context -> left.interpret(context) * right.interpret(context);
  }

  // VariableExpression 대체
  static PostfixExpression variable(Character character) {
    return context -> context.get(character);
  }

}
