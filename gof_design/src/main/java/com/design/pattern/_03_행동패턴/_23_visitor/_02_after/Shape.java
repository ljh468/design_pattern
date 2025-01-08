package com.design.pattern._03_행동패턴._23_visitor._02_after;

public interface Shape {

  // 모든 기능은 하나로
  void accept(Device device);

}
