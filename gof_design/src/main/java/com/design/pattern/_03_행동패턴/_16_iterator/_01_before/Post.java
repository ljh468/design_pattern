package com.design.pattern._03_행동패턴._16_iterator._01_before;

import java.time.LocalDateTime;

public class Post {

  private String title;

  private LocalDateTime createdDateTime;

  public Post(String title) {
    this.title = title;
    this.createdDateTime = LocalDateTime.now();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(LocalDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }
}
