package car.example;

import car.Car;

public class Sonata extends Car{
  // 여기엔 멤버변수가 없음

  public static void main(String[] args) {
    Sonata sonata = new Sonata();
    // 부모 멤버변수 상속받아옴
    System.out.println(sonata.company);
    System.out.println(sonata.workerNum);
  }
}
