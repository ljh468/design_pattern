package com.design.pattern.combined.djview;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {

  // 비트와 BPM에 대한 옵저버들을 저장하는 리스트
  List<BeatObserver> beatObservers = new ArrayList<>();
  List<BPMObserver> bpmObservers = new ArrayList<>();

  // 초기 BPM 값
  int bpm = 90;

  // 비트 재생을 위한 스레드와 제어 플래그
  Thread thread;
  boolean stop = false;

  // 오디오 클립 객체 (비트 소리)
  Clip clip;

  /**
   * 오디오 클립을 초기화하는 메서드.
   * 사운드 파일을 지정된 경로에서 불러오고 Clip 객체에 할당합니다.
   */
  public void initialize() {
    try {
      // 사운드 파일 경로 지정
      File resource = new File("head_first_design/src/main/java/com/design/pattern/combined/djview/clap.wav");
      // 오디오 클립을 초기화
      clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
      // 오디오 입력 스트림을 사용해 사운드 파일을 클립에 로드
      clip.open(AudioSystem.getAudioInputStream(resource));
    } catch (Exception ex) {
      // 예외 발생 시 에러 메시지 출력
      System.out.println("Error: Can't load clip");
      System.out.println(ex);
    }
  }

  public void on() {
    bpm = 90;
    //notifyBPMObservers();
    thread = new Thread(this);
    stop = false;
    thread.start();
  }

  public void off() {
    stopBeat();
    stop = true;
  }

  public void run() {
    while (!stop) {
      playBeat();
      notifyBeatObservers();
      try {
        Thread.sleep(60000 / getBPM());
      } catch (Exception e) {
      }
    }
  }

  public void setBPM(int bpm) {
    this.bpm = bpm;
    notifyBPMObservers();
  }

  public int getBPM() {
    return bpm;
  }

  public void registerObserver(BeatObserver o) {
    beatObservers.add(o);
  }

  public void notifyBeatObservers() {
    for (int i = 0; i < beatObservers.size(); i++) {
      BeatObserver observer = (BeatObserver) beatObservers.get(i);
      observer.updateBeat();
    }
  }

  public void registerObserver(BPMObserver o) {
    bpmObservers.add(o);
  }

  public void notifyBPMObservers() {
    for (int i = 0; i < bpmObservers.size(); i++) {
      BPMObserver observer = (BPMObserver) bpmObservers.get(i);
      observer.updateBPM();
    }
  }

  public void removeObserver(BeatObserver o) {
    int i = beatObservers.indexOf(o);
    if (i >= 0) {
      beatObservers.remove(i);
    }
  }

  public void removeObserver(BPMObserver o) {
    int i = bpmObservers.indexOf(o);
    if (i >= 0) {
      bpmObservers.remove(i);
    }
  }

  public void playBeat() {
    clip.setFramePosition(0);
    clip.start();
  }

  public void stopBeat() {
    clip.setFramePosition(0);
    clip.stop();
  }

}

