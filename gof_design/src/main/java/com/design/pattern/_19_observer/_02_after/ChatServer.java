package com.design.pattern._19_observer._02_after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Subject (주제)
public class ChatServer {

  // 주제별로 옵저버들의 목록을 관리 (subject가 key, observer들이 vlaue)
  private Map<String, List<Subscriber>> subscribers = new HashMap<>();

  // 옵저버 등록
  public void register(String subject, Subscriber subscriber) {
    if (this.subscribers.containsKey(subject)) {
      this.subscribers.get(subject).add(subscriber);
    } else {
      List<Subscriber> list = new ArrayList<>();
      list.add(subscriber);
      this.subscribers.put(subject, list);
    }
  }

  // 옵저버 탈퇴
  public void unregister(String subject, Subscriber subscriber) {
    if (this.subscribers.containsKey(subject)) {
      this.subscribers.get(subject).remove(subscriber);
    }
  }

  // 상태를 변경할 수 있는 기능 (메시지를 보내는 행위 자체가 상태를 변경하는 행위라고 봄)
  // 누군가가 메시지를 보냈을 때, 유저에게 알려주는 기능 (주제 상태변경 -> 옵저버에 전달)
  public void sendMessage(User user, String subject, String message) {
    if (this.subscribers.containsKey(subject)) {
      String userMessage = user.getName() + ": " + message; // 누가, 무슨 메시지를 보냈다.
      // 해당 주제를 구독하고 있는 Subscriber에게 메시지 전달
      this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
    }
  }

}
