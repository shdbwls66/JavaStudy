package day9;

public class Test1 {
  public static void main(String[] args) {
    System.out.println(add(2,1));
    System.out.println(minus(2,1));
    System.out.println(mul(2,1));
    System.out.println(divide(2,1));
  }

  static int add(int a, int b) {
    return a+b;
  }

  static int minus(int a, int b) {
    return a-b;
  }
  static int mul(int a, int b) {
    return a*b;
  }
  static int divide(int a, int b) {
    return a/b;
  }
}
