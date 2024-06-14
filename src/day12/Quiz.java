package day12;

import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("첫 번째 정수 입력: ");
    int num1 = scanner.nextInt();
    System.out.println("두 번째 정수 입력: ");
    int num2 = scanner.nextInt();

    try{
      divide(num1, num2);
    } catch (ArithmeticException e){
      System.out.println(e.getMessage());
    } finally{
      System.out.println("프로그램이 종료되었습니다.");
      scanner.close(); // finally 안에다 작성할 것
    }

  }

  public static void divide(int num1, int num2) throws ArithmeticException {
    if (num2 == 0){
      throw new ArithmeticException("0으로 나눌 수 없습니다.");
    } else {
      double result = (double) num1 / num2;
      System.out.println(result);
    }
  }
}
