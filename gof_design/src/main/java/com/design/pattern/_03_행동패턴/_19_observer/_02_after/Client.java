package com.design.pattern._03_행동패턴._19_observer._02_after;

public class Client {

  public static void main(String[] args) {
    ChatServer chatServer = new ChatServer();
    User user1 = new User("user1");
    User user2 = new User("user2");

    System.out.println("|user1| {나는솔로, 솔리지옥} 구독함");
    chatServer.register("나는솔로", user1);
    chatServer.register("솔로지옥", user1);
    System.out.println("|user2| {나는솔로} 구독함");
    chatServer.register("나는솔로", user2);
    System.out.println();

    System.out.println("user1 -> 나는솔로 주제로 메시지 보냄");
    chatServer.sendMessage(user1, "나는솔로", "아.. 이름이 기억났어.. 일남이야.. 오일남");
    System.out.println();

    System.out.println("user2 -> 솔로지옥 주제로 메시지 보냄");
    chatServer.sendMessage(user2, "솔로지옥", "옵저버 패턴으로 만든 채팅");
    System.out.println();

    System.out.println("|user2| {나는솔로} 구독취소");
    chatServer.unregister("나는솔로", user2);
    System.out.println();

    System.out.println("user2 -> 나는솔로 주제로 메시지 보냄");
    chatServer.sendMessage(user2, "나는솔로", "옵저버 패턴 장, 단점 보는 중");
  }
}
