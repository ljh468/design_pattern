package com.design.pattern._03_행동패턴._18_memento._01_before;

public class Client {

  public static void main(String[] args) {
    Game game = new Game();
    game.setRedTeamScore(10);
    game.setBlueTeamScore(20);

    // 캡슐화가 깨진 것 (클라이언트가 Game의 내부 값을 알게 되니까 - blueTeamScore, redTeamScore)
    int blueTeamScore = game.getBlueTeamScore();
    int redTeamScore = game.getRedTeamScore();

    Game restoredGame = new Game();
    restoredGame.setBlueTeamScore(blueTeamScore);
    restoredGame.setRedTeamScore(redTeamScore);


  }
}
