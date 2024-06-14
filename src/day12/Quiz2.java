package day12;

import java.util.Scanner;

public class Quiz2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("원하는 배열 크기를 입력하세요");
      int arrLength = sc.nextInt();
      int[] arr = new int[arrLength];

      System.out.println("배열 요소를 입력하세요 :");
      int i = 0;
      while (true) {
        System.out.println("arr[" + i + "] = ");
        arr[i] = sc.nextInt();
        System.out.println("arr[" + i + "] = " + arr[i]);
        i++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 인덱스를 벗어났습니다.");
    } finally {
      System.out.println("정상적으로 종료되었습니다");
      sc.close();
    }
  }
}
