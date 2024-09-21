package com.design.pattern.combined.djview.simple;

// Controller
public class Controller {
  private Model model;
  private View view;

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;

    // 뷰가 옵저버로 등록되도록 설정
    this.model.addObserver(view);

    // 버튼 클릭 시 모델 업데이트
    this.view.addSubmitButtonListener(e -> updateModelValue());
  }

  private void updateModelValue() {
    try {
      int newValue = Integer.parseInt(view.getInputValue());
      model.setValue(newValue);
    } catch (NumberFormatException ex) {
      view.setResultLabel("Invalid input!");
    }
  }
}
