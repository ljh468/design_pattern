package com.design.pattern._03_행동패턴._16_iterator._02_after;


import com.design.pattern._03_행동패턴._16_iterator._01_before.Post;

import java.util.Iterator;

public class Client {

  public static void main(String[] args) {
    Board board = new Board();
    board.addPost("디자인 패턴 게임");
    board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
    board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

    // 내부구조를 숨기고, 공통으로 집합체에 접근할 수 있게됨 - `Iterator패턴`
    // TODO 들어간 순서대로 순회하기
    Iterator<Post> iterator = board.getDefaultIterator();
    System.out.println("iterator 구현체 : " + iterator.getClass());
    while (iterator.hasNext()) {
      System.out.println(iterator.next().getTitle());
    }

    System.out.println();

    // TODO 가장 최신 글 먼저 순회하기
    Iterator<Post> recentPostIterator = board.getRecentPostIterator();
    System.out.println("recentPostIterator 구현체 : " + recentPostIterator.getClass());
    while (recentPostIterator.hasNext()) {
      System.out.println(recentPostIterator.next().getTitle());
    }
  }

}
