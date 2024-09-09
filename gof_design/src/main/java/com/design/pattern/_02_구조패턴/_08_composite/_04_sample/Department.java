package com.design.pattern._02_구조패턴._08_composite._04_sample;

// Composite 클래스: 복합 객체
import java.util.ArrayList;
import java.util.List;

class Department implements Component {

  private String name;

  // Component를 담을 수 있게 리스트로 컴포지션 함
  private List<Component> components = new ArrayList<>();

  public Department(String name) {
    this.name = name;
  }

  public void addComponent(Component component) {
    components.add(component);
  }

  public void removeComponent(Component component) {
    components.remove(component);
  }

  @Override
  public void showDetails() {
    System.out.println(name);
    for (Component component : components) {
      component.showDetails();
    }
  }
}

