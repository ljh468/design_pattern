package com.design.pattern.proxy.gumball;

import java.io.Serializable;

// rmi에 이용할 객체는 serializable 되어야 함
public interface State extends Serializable {

  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();

}
