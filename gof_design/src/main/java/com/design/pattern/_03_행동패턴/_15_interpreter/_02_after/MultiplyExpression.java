package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Map;

// Non Terminal Expression
public class MultiplyExpression implements PostfixExpression {

  private PostfixExpression left, right;

  public MultiplyExpression(PostfixExpression left, PostfixExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(Map<Character, Integer> context) {
    return left.interpret(context) * right.interpret(context);
  }
}
