package com.design.pattern._02_구조패턴._11_flyweight._01_before;

public class Client {

  public static void main(String[] args) {
    Character c1 = new Character('h', "white", "Nanum", 12);
    Character c2 = new Character('e', "white", "Nanum", 12);
    Character c3 = new Character('l', "white", "Nanum", 12);
    Character c4 = new Character('l', "white", "Nanum", 12);
    Character c5 = new Character('o', "white", "Nanum", 12);
  }
}
