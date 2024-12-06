package com.design.pattern._03_행동패턴._18_memento._02_after;

// Originator
public class Game {

  private int redTeamScore;

  private int blueTeamScore;

  public int getRedTeamScore() {
    return redTeamScore;
  }

  public void setRedTeamScore(int redTeamScore) {
    this.redTeamScore = redTeamScore;
  }

  public int getBlueTeamScore() {
    return blueTeamScore;
  }

  public void setBlueTeamScore(int blueTeamScore) {
    this.blueTeamScore = blueTeamScore;
  }

  // createMemento()
  public GameSave save() {
    return new GameSave(this.blueTeamScore, this.redTeamScore);
  }

  // restore
  public void restore(GameSave gameSave) {
    this.blueTeamScore = gameSave.getBlueTeamScore();
    this.redTeamScore = gameSave.getRedTeamScore();
  }

}
