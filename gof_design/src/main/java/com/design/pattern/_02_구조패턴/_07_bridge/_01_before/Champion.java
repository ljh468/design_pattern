package com.design.pattern._02_구조패턴._07_bridge._01_before;

import com.design.pattern._02_구조패턴._07_bridge._02_after.Skin;

public interface Champion extends Skin {

  void move();

  void skillQ();

  void skillW();

  void skillE();

  void skillR();

}
