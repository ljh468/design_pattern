package com.design.pattern._02_구조패턴._10_facade._02_after;

public class Client {

    // 퍼사드에만 의존하는 코드가 됨 (서브 시스템을 교체하기 용이해짐)
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        // 이메일 세팅을 넣어줌
        EmailSender emailSender = new EmailSender(emailSettings);

        // 메세지를 만들어서 메일을 보냄
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("jaehoon");
        emailMessage.setTo("noah");
        emailMessage.setCc("누군가");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
    }
}
