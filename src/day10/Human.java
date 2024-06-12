package day10;

public class Human {
  final String name;
  int age;
  static final String GENDER;
  static {
    GENDER = "Female";
  }
  static final int BIRTH_YEAR = 2000;
  static final String NATION = "Korea";
  static final boolean SURVIVE = true;

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    this.sayHello();
    System.out.println("I am " + this.age + " years old.");
  }
}
