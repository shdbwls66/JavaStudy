package car.example;

import car.Animal;

public class Dog extends Animal {

  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.name = "뽀삐";
    System.out.println("이 Dog의 이름은: " +dog.name);

    dog.gender = "여";
    System.out.println("gender: " +dog.gender);
  }
}
