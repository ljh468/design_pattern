package com.design.pattern._02_구조패턴._09_decorator._02_after;

public class Client {

  private CommentService commentService;

  public Client(CommentService commentService) {
    this.commentService = commentService;
  }

  public void writeComment(String comment) {
    commentService.addComment(comment);
  }
}
