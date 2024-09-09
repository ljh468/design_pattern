package com.design.pattern._02_구조패턴._08_composite._04_sample;

public class CompositePatternExample {
  public static void main(String[] args) {
    // Leaf 객체 생성
    Employee emp1 = new Employee("조인성", "Developer");
    Employee emp2 = new Employee("고윤정", "Designer");
    Employee emp3 = new Employee("류승룡", "Manager");

    // Composite 객체 생성
    Department devDept = new Department("개발 부서");
    devDept.addComponent(emp1);
    devDept.addComponent(emp2);
    Department hrDept = new Department("HR 부서");
    hrDept.addComponent(emp3);

    // 전체 회사를 나타내는 최상위 Composite 객체 생성
    Department company = new Department("무빙 기업");
    company.addComponent(devDept);
    company.addComponent(hrDept);

    // 개별 객체를 처리
    System.out.println("==== 개별객체 출력 ====");
    showDetails(emp2);
    /**
     고윤정 (Designer)
     **/

    // 동일한 방식으로 복합 객체 모두 처리
    System.out.println("\n==== 복합객체 출력 ====");
    showDetails(company);
    /**
     무빙 기업
     개발 부서
     조인성 (Developer)
     고윤정 (Designer)
     HR 부서
     류승룡 (Manager)
     **/
  }

  private static void showDetails(Component component) {
    component.showDetails();
  }
}

