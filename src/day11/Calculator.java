package day11;

public class Calculator {
  private static final double PI = 3.14159;

  double areaCircle(double r) {
    System.out.println("Calculator 객체의 areaCircle 메서드 실행");
    return PI * r * r;
  }

  void say(){
    System.out.println("Calculator 에서 말하고 있습니다!");
  }

}
