package com.design.pattern._02_구조패턴._12_proxy._03_java;

import org.springframework.stereotype.Service;

@Service
public class GameService {

  public void startGame() {
    System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
  }

}
