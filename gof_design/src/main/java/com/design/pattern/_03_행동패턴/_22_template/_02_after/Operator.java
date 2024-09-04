package com.design.pattern._03_행동패턴._22_template._02_after;

// 콜백 인터페이스
public interface Operator {

  abstract int getResult(int result, int number);
  
}
