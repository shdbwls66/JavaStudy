package day10;

public class MainPerson {
  public static void main(String[] args) {
    Person person = new Person(100, 5000, false);

    Food food = new Food(50, 30, "사탕");

    person.buyFood(food);

    System.out.println(person.weight);
    System.out.println(person.money);

    person.eatFood(food);
    System.out.println(person.weight);
  }
}
