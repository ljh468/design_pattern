package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Map;

// Terminal Expression
public class VariableExpression implements PostfixExpression {

  private Character character;

  public VariableExpression(Character character) {
    this.character = character;
  }

  @Override
  public int interpret(Map<Character, Integer> context) {
    return context.get(this.character);
  }
}
