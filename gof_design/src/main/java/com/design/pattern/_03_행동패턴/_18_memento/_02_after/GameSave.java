package com.design.pattern._03_행동패턴._18_memento._02_after;

// Memento (immutable한 객체로 관리) - 스냅샷
public final class GameSave {

  private final int blueTeamScore;

  private final int redTeamScore;

  public GameSave(int blueTeamScore, int redTeamScore) {
    this.blueTeamScore = blueTeamScore;
    this.redTeamScore = redTeamScore;
  }

  public int getBlueTeamScore() {
    return blueTeamScore;
  }

  public int getRedTeamScore() {
    return redTeamScore;
  }
}
