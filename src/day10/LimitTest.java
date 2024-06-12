package day10;

public class LimitTest {
  private String name2 = "Java";
  String name;
  int age;
  int gold;

  public LimitTest(String name, int age) {
    this.name = name;
    this.age = age;

  }

  private String getName2(){
    return this.name2;
  }

  public void sayHello() {
    getName2();
    System.out.println("Hello my name is " + this.name2);
  }

//  private String checkAmount(int amount) {
//    if (amount > this.gold) {
//      return "요청하신 금액이 너무 큽니다";
//    }
//    return "정상처리되었습니다";
//  }
//
//  public String deposit(int amount){
//    return checkAmount(amount);
//  }

//  protected void testMethod(){
//    System.out.println("test");
//  }

}
