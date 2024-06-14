package day12;

import java.util.Scanner;

public class Quiz4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("문자열을 입력하세요");
      int num = Integer.parseInt(sc.nextLine());
      System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println("정수로 출력할 수 없습니다");
    } finally{
      System.out.println("프로그램이 정상적으로 종료되었습니다.");
      sc.close();
    }
  }
}
