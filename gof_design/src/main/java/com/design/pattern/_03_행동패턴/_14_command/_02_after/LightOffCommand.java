package com.design.pattern._03_행동패턴._14_command._02_after;

import com.design.pattern._03_행동패턴._14_command._01_before.Light;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    new LightOnCommand(this.light).execute();
  }
}
