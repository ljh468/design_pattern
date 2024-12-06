package com.design.pattern._03_행동패턴._18_memento._01_before;

import java.io.Serial;
import java.io.Serializable;

public class Game implements Serializable {

  // @Serial 애노테이션을 사용하여 serialVersionUID 자동 생성 (직렬화된 객체의 버전을 관리)
  @Serial
  private static final long serialVersionUID = 1L; // 컴파일러가 1L을 무시함

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
}
