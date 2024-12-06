package com.design.pattern._03_행동패턴._18_memento._03_java;

import com.design.pattern._03_행동패턴._18_memento._01_before.Game;

import java.io.*;

public class MementoInJava {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // TODO: Serializable
    Game game = new Game();
    game.setRedTeamScore(10);
    game.setBlueTeamScore(20);

    // TODO: 직렬화
    try (FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
      out.writeObject(game); // 바이트스트림으로 저장
    }

    game.setBlueTeamScore(25);
    game.setRedTeamScore(15);

    // TODO: 역직렬화
    try (FileInputStream fileIn = new FileInputStream("GameSave.hex");
         ObjectInputStream in = new ObjectInputStream(fileIn)) {
      game = (Game) in.readObject(); // 바이트스트림을 복원
      System.out.println(game.getBlueTeamScore());
      System.out.println(game.getRedTeamScore());
    }
  }
}
