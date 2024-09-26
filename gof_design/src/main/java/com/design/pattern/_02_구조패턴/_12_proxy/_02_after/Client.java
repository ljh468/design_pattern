package com.design.pattern._02_구조패턴._12_proxy._02_after;

public class Client {

  public static void main(String[] args) {
    GameService gameService = new GameServiceProxy();
    gameService.startGame();
  }
}
