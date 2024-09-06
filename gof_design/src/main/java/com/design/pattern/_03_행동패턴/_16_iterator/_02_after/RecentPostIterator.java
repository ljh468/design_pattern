package com.design.pattern._03_행동패턴._16_iterator._02_after;

import com.design.pattern._03_행동패턴._16_iterator._01_before.Post;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Iterator를 구현
public class RecentPostIterator implements Iterator<Post> {

  // 내부적으로 Iterator를 가짐
  private Iterator<Post> internalIterator;

  public RecentPostIterator(List<Post> posts) {
    Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
    this.internalIterator = posts.iterator();
  }

  @Override
  public boolean hasNext() {
    return this.internalIterator.hasNext();
  }

  @Override
  public Post next() {
    return this.internalIterator.next();
  }
}
