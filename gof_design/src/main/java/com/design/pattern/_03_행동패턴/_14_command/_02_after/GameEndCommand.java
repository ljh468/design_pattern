package com.design.pattern._03_행동패턴._14_command._02_after;

import com.design.pattern._03_행동패턴._14_command._01_before.Game;

public class GameEndCommand implements Command {

  private Game game;

  public GameEndCommand(Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.end();
  }

  @Override
  public void undo() {
    new GameStartCommand(this.game).execute();
  }
}
