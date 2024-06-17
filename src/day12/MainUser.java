package day12;

import java.util.Scanner;

public class MainUser {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("id를 입력하세요");
      String id = sc.nextLine();
      System.out.println("id: " + id + " 설정완료!");

      System.out.println("nickname 을 입력하세요");
      String nickname = sc.nextLine();
      checkNickname(nickname);

      User user = new User(id, nickname);

      System.out.println("당신의 id: " + user.id + ", 당신의 nickname: " + user.nickname);

    } catch (TestException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("프로그램이 정상적으로 종료되었습니다.");
      sc.close();
    }
  }

  public static void checkNickname(String nickname) throws TestException {
    if (nickname.length() < 2 || nickname.length() > 6) {
      throw new TestException("닉네임은 2자 이상 6자 이하로 설정해주세요");
    } else {
      System.out.println("nickname: " + nickname + " 설정완료!");
    }
  }
}
