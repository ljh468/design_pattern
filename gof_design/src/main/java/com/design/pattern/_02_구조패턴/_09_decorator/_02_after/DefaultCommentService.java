package com.design.pattern._02_구조패턴._09_decorator._02_after;

public class DefaultCommentService implements CommentService {
  @Override
  public void addComment(String comment) {
    System.out.println(comment);
  }
}
