package com.design.pattern._03_행동패턴._23_visitor._02_after;

// Concrete Visitor B
public class Watch implements Device {

  @Override
  public void print(Circle circle) {
    System.out.println("Print Circle to Watch");
  }

  @Override
  public void print(Rectangle rectangle) {
    System.out.println("Print Rectangle to Watch");
  }

  @Override
  public void print(Triangle triangle) {
    System.out.println("Print Triangle to Watch");
  }
}
