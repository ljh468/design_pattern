package com.design.pattern.command.party;

public class MacroCommand implements Command {

  Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  public void execute() {
    for (int i = 0; i < commands.length; i++) {
      commands[i].execute();
    }
  }

  //NOTE: 안정성을 위해 실행된 작업들을 역순으로 undo함 (각 작업이 이전 작업에 영향을 미칠 수 있기 때문)
  public void undo() {
    for (int i = commands.length - 1; i >= 0; i--) {
      commands[i].undo();
    }
  }
}

