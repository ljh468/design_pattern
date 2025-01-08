package com.design.pattern._01_생성패턴._05_prototype._02_after;

import java.util.Objects;

public class GithubIssue implements Cloneable {

  private int id;

  private String title;

  private GithubRepository repository;

  public GithubIssue(GithubRepository repository) {
    this.repository = repository;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GithubRepository getRepository() {
    return repository;
  }

  public String getUrl() {
    return String.format("https://github.com/%s/%s/issues/%d",
                         repository.getUser(),
                         repository.getName(),
                         this.getId());
  }

  // 자바가 객체를 복제하는 메커니즘을 제공 (Object 안에 clone()이 있음)
  // protected 라서 Cloneable 인터페이스를 구현하고, clone()을 오버라이딩해서 사용
  // 기본 super.clone()은 얕은 복사 (주소값만 복사)
  @Override
  protected Object clone() throws CloneNotSupportedException {
    GithubRepository repository = new GithubRepository();
    repository.setUser(this.repository.getUser());
    repository.setName(this.repository.getName());

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(this.id);
    githubIssue.setTitle(this.title);

    return githubIssue;
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {return true;}
      if (o == null || getClass() != o.getClass()) {return false;}
    GithubIssue that = (GithubIssue) o;
    return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, repository);
  }
}
