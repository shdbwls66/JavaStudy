package day9;

public class Student {
  int level; // 멤버 변수 (클래스의 상태)

  // 생성자
  public Student() {
    this.level = 1;
  }

  // 메서드 (기능)
  public void levelUp() {

    level++;
    System.out.println("레벨이 1 증가 했습니다.");
    System.out.println("현재 레벨은 = " + level + "입니다.");

  }

  public void levelDown() {

    if (level > 1) {
      level--;
      System.out.println("레벨이 1 감소 했습니다.");
      System.out.println("현재 레벨은 = " + level + "입니다.");
    } else {
      System.out.println("최소 레벨입니다");
      System.out.println("현재 레벨은 = " + level + "입니다.");
    }
  }
}
