package com.design.pattern._03_행동패턴._16_iterator._4_sample;

// 컬렉션을 구현한 구체 클래스
class NameCollection implements IterableCollection<String> {

  private String[] names;

  public NameCollection(String[] names) {
    this.names = names;
  }

  // Iterator를 반환함
  @Override
  public Iterator<String> iterator() {
    return new NameIterator();
  }

  // 내부 클래스로 Iterator를 구현: NameIterator
  private class NameIterator implements Iterator<String> {
    int index = 0;

    @Override
    public boolean hasNext() {
      return index < names.length;
    }

    @Override
    public String next() {
      if (hasNext()) {
        return names[index++];
      }
      return null;
    }
  }
}
