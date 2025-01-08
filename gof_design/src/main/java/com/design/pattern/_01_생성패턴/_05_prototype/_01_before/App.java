package com.design.pattern._01_생성패턴._05_prototype._01_before;

public class App {

  public static void main(String[] args) {
    GithubRepository repository = new GithubRepository();
    repository.setUser("noah");
    repository.setName("live-study");

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(1);
    githubIssue.setTitle("JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    String url = githubIssue.getUrl();
    System.out.println(url);

    // TODO: 기존에 있던 인스턴스를 복제해서 객체를 만들고 싶을때
    // clone != githubIssue -> false
    // clone.equals(githubIssue) -> true
  }

}
