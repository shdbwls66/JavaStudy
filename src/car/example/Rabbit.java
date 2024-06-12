package car.example;

import car.Animal;

public class Rabbit extends Animal {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();

    rabbit.name = "토깽이";
    System.out.println("이 Rabbit의 이름은: " + rabbit.name);

    rabbit.gender = "여";
    System.out.println("gender: " + rabbit.gender);
  }
}
