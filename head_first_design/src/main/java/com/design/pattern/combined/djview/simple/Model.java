package com.design.pattern.combined.djview.simple;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// Model
public class Model {
  private int value;
  private PropertyChangeSupport support;

  public Model() {
    support = new PropertyChangeSupport(this);
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    int oldValue = this.value;
    this.value = value;
    support.firePropertyChange("value", oldValue, this.value); // 값이 변경되면 리스너에게 알림
  }

  public void addObserver(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

  public void removeObserver(PropertyChangeListener listener) {
    support.removePropertyChangeListener(listener);
  }
}
