package com.design.pattern._03_행동패턴._19_observer._01_before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {

  private Map<String, List<String>> messages;

  public ChatServer() {
    this.messages = new HashMap<>();
  }

  public void add(String subject, String message) {
    // 키값이 있으면 값 리스트에 메시지 추가
    if (messages.containsKey(subject)) {
      messages.get(subject).add(message);
    }
    // 키값이 없으면 값 리스트 생성하고, 메시지 추가
    else {
      List<String> messageList = new ArrayList<>();
      messageList.add(message);
      messages.put(subject, messageList);
    }
  }

  public List<String> getMessage(String subject) {
    return messages.get(subject);
  }
}
