package com.design.pattern._03_행동패턴._16_iterator._02_after;


import com.design.pattern._03_행동패턴._16_iterator._01_before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

  List<Post> posts = new ArrayList<>();

  public List<Post> getPosts() {
    return posts;
  }

  public void addPost(String content) {
    this.posts.add(new Post(content));
  }

  public Iterator<Post> getDefaultIterator() {
    return posts.iterator();
  }

  public Iterator<Post> getRecentPostIterator() {
    return new RecentPostIterator(this.posts);
  }

}
