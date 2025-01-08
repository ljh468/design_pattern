package com.design.pattern._01_생성패턴._05_prototype._02_after;

public class App {

  public static void main(String[] args) throws CloneNotSupportedException {
    GithubRepository repository = new GithubRepository();
    repository.setUser("noah");
    repository.setName("live-study");

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(1);
    githubIssue.setTitle("JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    String url = githubIssue.getUrl();
    System.out.println(url);

    GithubIssue clone = (GithubIssue) githubIssue.clone();
    System.out.println(clone.getUrl());

    repository.setUser("jaehoon");

    System.out.println(clone != githubIssue);
    System.out.println(clone.equals(githubIssue));
    System.out.println(clone.getClass() == githubIssue.getClass());

    // 기본 super.clone()은 shallowCopy 이기 때문에 참조한 객체는 같다고 나온다.
    // 만약 완전히 deepCopy 하려면 clone()에서 새로 만들어주면 된다.
    System.out.println(clone.getRepository() == githubIssue.getRepository());

    System.out.println("githubIssue: " + githubIssue.getUrl());
    System.out.println("clone: " + clone.getUrl());
  }

}
