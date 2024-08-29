package com.design.pattern.command.party;

public class RemoteLoader {

  public static void main(String[] args) {
    // 인보커
    RemoteControl remoteControl = new RemoteControl();

    // 리시버
    Light light = new Light("Living Room");
    TV tv = new TV("Living Room");
    Stereo stereo = new Stereo("Living Room");
    Hottub hottub = new Hottub();

    // 일련의 ON 커맨드들
    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);

    // 일련의 OFF 커맨드들
    LightOffCommand lightOff = new LightOffCommand(light);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
    TVOffCommand tvOff = new TVOffCommand(tv);
    HottubOffCommand hottubOff = new HottubOffCommand(hottub);

    // ON 커맨드용 배열, OFF 커맨드용 배열을 만듬
    Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
    Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

    // 매크로 커맨드에 전달
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    // 0번 슬롯에 매크로 커맨드 담기
    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    System.out.println(remoteControl);
    System.out.println("--- Pushing Macro On---");
    remoteControl.onButtonWasPushed(0);

    System.out.println("--- Pushing Macro Off---");
    remoteControl.offButtonWasPushed(0);
  }
}
