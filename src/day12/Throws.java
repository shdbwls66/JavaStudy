package day12;

public class Throws {
  public static void main(String[] args) {
    try {
      divide(1, 100);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } catch (NullPointerException e) {
      System.out.println("null 입니다");
    }
    System.out.println("정상적으로 죵료되었습니다.");
  }

  public static int divide(int a, int b) {
    if (a / b == 0) {
      throw new ArithmeticException();
    } else {
      throw new NullPointerException();
    }
  }
}
