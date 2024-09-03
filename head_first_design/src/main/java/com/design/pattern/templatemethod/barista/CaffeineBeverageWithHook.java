package com.design.pattern.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();

    // 고객이 원하면 첨가물을 추가
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();

  abstract void addCondiments();

  void boilWater() {
    System.out.println("Boiling water");
  }

  void pourInCup() {
    System.out.println("Pouring into cup");
  }

  // hook 메서드 (필요하면 서브클래스에서 오버라이드해서 사용)
  boolean customerWantsCondiments() {
    return true;
  }
}
