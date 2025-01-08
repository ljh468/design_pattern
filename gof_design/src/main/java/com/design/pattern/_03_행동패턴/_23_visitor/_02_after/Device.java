package com.design.pattern._03_행동패턴._23_visitor._02_after;

// Visitor
public interface Device {

  void print(Circle circle);

  void print(Rectangle rectangle);

  void print(Triangle triangle);
}
