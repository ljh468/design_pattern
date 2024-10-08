package com.design.pattern.iterator.implicit;

import java.util.Iterator;

public interface Menu {
  public Iterator<MenuItem> createIterator();
}
