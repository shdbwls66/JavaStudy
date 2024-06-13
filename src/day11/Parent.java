package day11;

public class Parent {
  int money;

  void method1(){
    System.out.println("Parent의 메서드1 호출");
  }

  void method2(){
    System.out.println("Parent의 메서드2 호출");
  }

  public void saveMoney() {
    this.money += 10000;
    System.out.println("만원 저축!! 현재 money : " + this.money);
  }
}
