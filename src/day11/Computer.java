package day11;

public class Computer extends Calculator {

  @Override // 오버라이딩 할 때 표시
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle 메서드 실행");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("Computer 에서 말하고 있습니다");
  }
}
