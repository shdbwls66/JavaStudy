package day9;

public class Me {
  String name;
  int age;
  String birth;

  public Me(String name, int age, String birth) {
    this.name = name;
    this.age = age;
    this.birth = birth;
  }

  public void eating(Condition condition) {
    System.out.println("음식을 먹었습니다");
    condition.energyUp();
    condition.moreHappy();
  }

  public void studying(Condition condition) {
    System.out.println("공부를 했습니다");
    condition.energyDown();
    condition.javaLevelUp();
  }

  public void listenMusic(Condition condition) {
    System.out.println("노래를 들었습니다");
    condition.energyUp();
    condition.moreHappy();
  }

  public void playTheBass(Condition condition) {
    System.out.println("베이스를 쳤습니다");
    condition.energyUp();
    condition.moreHappy();
  }
}
