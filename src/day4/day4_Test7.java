package day4;

public class day4_Test7 {
  public static void main(String[] args) {
    // 1번
    int x = 10;
    String str = (x > 0) ? "양수" : ((x < 0) ? "음수" : "0입니다");
    System.out.println(str);

    // 2번
    int score = 75;
    if (score >= 90) {
      System.out.println('A');
    } else if (score >= 80) {
      System.out.println('B');
    } else if (score >= 70) {
      System.out.println('C');
    } else if (score >= 60) {
      System.out.println('D');
    } else {
      System.out.println('F');
    }

    // 3번
    int year = 2023;
    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("윤년입니다");
    } else {
      System.out.println("윤년 아님");
    }

    // 4번
    int a = 10, b = 20, c = 30;

    if ((a > b) && (a > c)) {
      System.out.println("a가 제일 크다");
    } else if ((a < c) && (b < c)) {
      System.out.println("c가 제일 크다");
    } else {
      System.out.println("b가 제일 크다");
    }

    // 5번
    int passScore = 60;
    int myScore = 75;

    String str2 = myScore >= passScore ? "합격" : "불합격";
    System.out.println(str2);
  }
}
