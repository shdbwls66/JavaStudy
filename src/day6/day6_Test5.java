package day6;

import java.util.Scanner;

public class day6_Test5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("영화 제목");
    String movie = scanner.nextLine();

    System.out.println("관람 인원 수");
    int num = scanner.nextInt();
    scanner.nextLine();

    System.out.println("예매자의 이름");
    String name = scanner.nextLine();

    System.out.println("예매자의 전화번호");
    String phone = scanner.nextLine();

    int price = 10000;

    System.out.println("===== 영화 티켓 예매 정보 =====");
    System.out.println("영화 제목: " + movie);
    System.out.println("관람 인원: " + num + "명");
    System.out.println("예매자 이름: " + name);
    System.out.println("예매자 전화번호: " + phone);
    System.out.println("총 결제 금액: " + num * price + "원");

    scanner.close();
  }
}
