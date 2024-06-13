package day11;

public class Animal {
  String name;

  //  String gender;
  //
  //  public Animal(String name) {
  //    this.name = name;
  //  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println(this.name + "Zzzzzz..");
  }
}
