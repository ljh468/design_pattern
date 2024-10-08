package com.design.pattern._02_구조패턴._11_flyweight._01_before;

public class Character {

  private char value;

  private String color;

  private String fontFamily;

  private int fontSize;

  public Character(char value, String color, String fontFamily, int fontSize) {
    this.value = value;
    this.color = color;
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
  }
}
