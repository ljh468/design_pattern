package com.design.pattern._01_생성패턴._05_prototype._03_java;

import com.design.pattern._01_생성패턴._05_prototype._02_after.GithubIssue;
import com.design.pattern._01_생성패턴._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

  public static void main(String[] args) {
    GithubRepository repository = new GithubRepository();
    repository.setUser("noah");
    repository.setName("java");

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(1);
    githubIssue.setTitle("ModelMapper가 무엇일까요?");

    // TODO: ModelMapper 의존성 추가 해야함
    ModelMapper modelMapper = new ModelMapper(); // 리플랙션을 이용함
    GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
    System.out.println(githubIssueData);
  }
}
