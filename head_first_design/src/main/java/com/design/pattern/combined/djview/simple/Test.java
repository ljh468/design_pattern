package com.design.pattern.combined.djview.simple;

// Main.java
public class Test {
  public static void main(String[] args) {
    // MVC 구성 요소 생성
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);

    // 프로그램 시작
    view.setVisible(true);
  }
}

