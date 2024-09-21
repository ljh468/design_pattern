package com.design.pattern.combined.djview.simple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// View
public class View extends JFrame implements PropertyChangeListener {
  private JTextField inputField = new JTextField(10);
  private JButton submitButton = new JButton("Submit");
  private JLabel resultLabel = new JLabel("Current Value: 0");

  public View() {
    // JFrame 기본 설정
    this.setTitle("MVC Example with Observer");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 150);

    // 패널 레이아웃 설정
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    panel.add(new JLabel("Enter a number: "));
    panel.add(inputField);
    panel.add(submitButton);
    panel.add(resultLabel);

    // 패널을 프레임에 추가
    this.add(panel);
  }

  public String getInputValue() {
    return inputField.getText();
  }

  public void setResultLabel(String text) {
    resultLabel.setText(text);
  }

  public void addSubmitButtonListener(ActionListener listener) {
    submitButton.addActionListener(listener);
  }

  // 모델이 변경되면 호출되는 메서드
  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    if ("value".equals(evt.getPropertyName())) {
      setResultLabel("Current Value: " + evt.getNewValue());
    }
  }
}
