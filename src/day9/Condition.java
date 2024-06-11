package day9;

public class Condition {
  int energy;
  int happiness;
  int javaLevel;

  public Condition() {
    this.energy = 50;
    this.happiness = 50;
    this.javaLevel = 0;
  }

  public void energyUp() {
    if (energy < 100) {
      energy++;
      System.out.println("현재 hp는: " + energy);
    } else {
      System.out.println("최상의 상태 입니다");
      System.out.println("현재 hp는: " + energy);
    }
  }

  public void energyDown() {
    if (energy > 0) {
      energy--;
      System.out.println("현재 hp는: " + energy);
    } else {
      System.out.println("최하 입니다. 좀 쉬세요.");
      System.out.println("현재 hp는: " + energy);
    }
  }

  public void moreHappy() {
    if (happiness < 100) {
      happiness++;
      System.out.println("현재 행복도: " + happiness);
    } else {
      System.out.println("최대 입니다");
      System.out.println("현재 행복도: " + happiness);
    }
  }

  public void javaLevelUp() {
    if (javaLevel < 100) {
      javaLevel++;
      System.out.println("자바 레벨 1 증가!");
      System.out.println("현재 자바 레벨: " + javaLevel);
    } else {
      System.out.println("최대 입니다! 열심히 하고 있군요!");
      System.out.println("현재 자바 레벨: " + javaLevel);
    }
  }

  public void javaLevelDown() {
    if (javaLevel > 0) {
      javaLevel--;
      System.out.println("자바 레벨 1 감소");
      System.out.println("현재 자바 레벨: " + javaLevel);
    } else {
      System.out.println("최소 레벨 입니다. 좀 열심히 하세요.");
      System.out.println("현재 자바 레벨: " + javaLevel);
    }
  }

}
