package com.design.pattern._03_행동패턴._14_command._02_after;

import com.design.pattern._03_행동패턴._14_command._01_before.Game;

public class MyApp {

  private Command command;

  public MyApp(Command command) {
    this.command = command;
  }

  public void press() {
    command.execute();
  }

  public static void main(String[] args) {
    MyApp myApp = new MyApp(new GameStartCommand(new Game()));
  }
}
