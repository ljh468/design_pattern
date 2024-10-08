package com.design.pattern._02_구조패턴._09_decorator._02_after;

public class CommentDecorator implements CommentService {

  private CommentService commentService;

  public CommentDecorator(CommentService commentService) {
    this.commentService = commentService;
  }

  @Override
  public void addComment(String comment) {
    commentService.addComment(comment);
  }
}
