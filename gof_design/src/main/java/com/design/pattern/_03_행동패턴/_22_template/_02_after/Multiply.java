package com.design.pattern._03_행동패턴._22_template._02_after;

// 상속을 이용한 템플릿메서드 패턴
public class Multiply extends FileProcessor {

  public Multiply(String path) {
    super(path);
  }

  // 알고리즘의 일부분을 변경
  @Override
  protected int getResult(int result, int number) {
    return result *= number;
  }

}
