package com.design.pattern._03_행동패턴._19_observer._01_before;

import java.util.List;

public class User {

  private ChatServer chatServer;

  public User(ChatServer chatServer) {
    this.chatServer = chatServer;
  }

  // 주제에 해당하는 메시지를 보냄
  public void sendMessage(String subject, String message) {
    chatServer.add(subject, message);
  }

  // 주제에 해당하는 메시지들을 가져옴
  public List<String> getMessage(String subject) {
    return chatServer.getMessage(subject);
  }

}
