package com.design.pattern._03_행동패턴._15_interpreter._02_after;

import java.util.Map;

public interface PostfixExpression {

  int interpret(Map<Character, Integer> context);

}
