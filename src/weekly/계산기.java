package weekly;

import java.util.Scanner;

public class 계산기 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
      int num = scanner.nextInt();

      if (num == 0) {
        System.out.println("종료!!");
        break;
      }

      int num1 = 0;
      int num2 = 0;
      int result = 0;

      switch (num) {
        case 1:
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
          num1 = scanner.nextInt();
          System.out.println("두번째 값을 입력하고 엔터를 누르세요");
          num2 = scanner.nextInt();
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
          break;
        case 2:
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
          num1 = scanner.nextInt();
          System.out.println("두번째 값을 입력하고 엔터를 누르세요");
          num2 = scanner.nextInt();
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
          break;
        case 3:
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
          num1 = scanner.nextInt();
          System.out.println("두번째 값을 입력하고 엔터를 누르세요");
          num2 = scanner.nextInt();
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
          break;
        case 4:
          System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
          num1 = scanner.nextInt();
          System.out.println("두번째 값을 입력하고 엔터를 누르세요");
          num2 = scanner.nextInt();
          double result1 = (double) num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result1);
          break;
        default:
          System.out.println("올바른 입력이 아닙니다.");
          break;
      }
    }
  }
}
