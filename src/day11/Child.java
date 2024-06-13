package day11;

public class Child extends Parent {

  void method2(){
    System.out.println("Child의 메서드2 호출");
  } // 부모 보다 접근 제한이 더 세면 안됨

  void method3(){
    System.out.println("Child의 메서드3 호출");
  }

//  public void invest() {
//    this.money -= 1000;
//    System.out.println("1000원 투자!! 현재 money : " + this.money);
//  }
}
