import java.util.Scanner;

public class day6_Test6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("학생 수를 입력하세요");
    int student = scanner.nextInt();
    scanner.nextLine();

    String grade = "";

    for (int i = 1; i <= student; i++) {
      System.out.println("학생 이름 입력하세요");
      String name = scanner.nextLine();

      System.out.println("국어 점수");
      int lang = scanner.nextInt();

      System.out.println("영어 점수");
      int eng = scanner.nextInt();

      System.out.println("수학 점수");
      int math = scanner.nextInt();
      scanner.nextLine();

      int score = lang + eng + math;
      double avg = (double) score / 3;

      if (avg >= 90) {
        grade = "A";
      } else if (avg >= 80) {
        grade = "B";
      } else if (avg >= 70) {
        grade = "C";
      } else if (avg >= 60) {
        grade = "D";
      } else {
        grade = "F";
      }

      System.out.println("===== 학생 성적 정보 =====");
      System.out.println("이름: " + name);
      System.out.println("국어 점수: " + lang);
      System.out.println("영어 점수: " + eng);
      System.out.println("수학 점수: " + math);
      System.out.println("총점: " + score);
      System.out.printf("평균: %.2f%n", avg);
      System.out.println("등급: " + grade);
      System.out.println("========================");
    }
    scanner.close();
  }
}
