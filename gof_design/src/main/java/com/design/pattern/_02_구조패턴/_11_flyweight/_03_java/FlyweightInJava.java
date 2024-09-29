package com.design.pattern._02_구조패턴._11_flyweight._03_java;

public class FlyweightInJava {

  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(10);
    Integer i2 = Integer.valueOf(10);

    System.out.println(i1 == i2);
    // equals로 비교하지 않더라도 캐싱되어 있기 때문에 true가 나오는 것을 알 수 있음
  }
}
