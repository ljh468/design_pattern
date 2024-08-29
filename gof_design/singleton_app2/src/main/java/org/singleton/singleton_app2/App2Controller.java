package org.singleton.singleton_app2;

import org.singleton.singleton_common.SingletonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 하나의 JVM에 각기 다른 클래스로더를 할당하도록 멀티모듈 프로젝트를 이용해서 애플리케이션 2개를 배포
@RestController
public class App2Controller {
  @GetMapping("/app2")
  public String useSingleton() {
    SingletonService singleton = SingletonService.getInstance();
    return singleton.getInstanceAddress("App2");
  }
}
