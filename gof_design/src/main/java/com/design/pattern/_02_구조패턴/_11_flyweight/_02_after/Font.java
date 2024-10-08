package com.design.pattern._02_구조패턴._11_flyweight._02_after;

public final class Font {

  final String family;

  final int size;

  public Font(String family, int size) {
    this.family = family;
    this.size = size;
  }

  public String getFamily() {
    return family;
  }

  public int getSize() {
    return size;
  }
}
