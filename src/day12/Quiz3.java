package day12;

import java.util.Scanner;

public class Quiz3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("이름을 입력하세요");
      String name = sc.nextLine();

      System.out.println("나이를 입력하세요");
      int age = sc.nextInt();

      Person person = new Person(name, age);

      checkAge(age);

      System.out.println("이름: " + person.name + ", 나이: " + person.age);

    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    } finally{
      System.out.println("프로그램이 정상적으로 종료되었습니다.");
      sc.close();
    }

  }

  public static void checkAge(int age) throws InvalidAgeException{
    if (age < 0){
      throw new InvalidAgeException("음수는 작성할 수 없습니다.");
    }
  }

}
