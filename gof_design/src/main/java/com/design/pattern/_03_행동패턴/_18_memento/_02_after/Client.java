package com.design.pattern._03_행동패턴._18_memento._02_after;

// CareTaker
public class Client {

  public static void main(String[] args) {
    Game game = new Game();
    game.setBlueTeamScore(10);
    game.setRedTeamScore(20);

    // Originator의 내부정보를 Memento타입으로 가짐
    // 디테일한 정보를 알지 않더라도 게임의 정보를 가질 수 있음
    GameSave save = game.save();

    game.setBlueTeamScore(12);
    game.setRedTeamScore(22);

    game.restore(save);

    System.out.println(game.getBlueTeamScore());
    System.out.println(game.getRedTeamScore());
  }
}
