package day12;

public class TryCatchException {
  public static void main(String[] args) {
    try {
      int result = 10 / 0; // ArithmeticException
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");
  }
}
