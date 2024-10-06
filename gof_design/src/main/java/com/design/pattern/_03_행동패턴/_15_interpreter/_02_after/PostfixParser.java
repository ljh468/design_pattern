package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Stack;

public class PostfixParser {

  // 넘어온 값은 "xyz+-"
  public static PostfixExpression parse(String expression) {
    Stack<PostfixExpression> stack = new Stack<>();
    for (char c : expression.toCharArray()) {
      stack.push(getExpression(c, stack));
    }
    // 연산을 통해 스택에는 하나의 Expression만 남아있음
    return stack.pop();
  }

  private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
    switch (c) {
      case '+':
        return new PlusExpression(stack.pop(), stack.pop());
      case '-':
        PostfixExpression right = stack.pop();
        PostfixExpression left = stack.pop();
        return new MinusExpression(left, right);
      default:
        return new VariableExpression(c);
    }
  }
}
