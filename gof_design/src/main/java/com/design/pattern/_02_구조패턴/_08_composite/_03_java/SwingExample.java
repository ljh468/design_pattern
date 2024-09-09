package com.design.pattern._02_구조패턴._08_composite._03_java;

import javax.swing.*;

public class SwingExample {

    public static void main(String[] args) {
        // 복합 객체
        JFrame frame = new JFrame();

        // 개별 객체 : Frame에 Text를 추가
        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);

        // 개별 객체 : Frame에 Button을 추가
        JButton button = new JButton("click");
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(e -> textField.setText("Hello Swing"));
        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true); // 프레임 보여주기
    }
}
