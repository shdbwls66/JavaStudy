package day10;

public class Person {
    int weight;
    int money;
    boolean fat;

    public Person(int weight, int money, boolean fat) {
        this.weight = weight;
        this.money = money;
        this.fat = false;
    }

    public void buyFood(Food food) {
        this.money -= food.cost;
    }

    public void eatFood(Food food) {
        this.weight += food.weight;
        if (this.weight >= 150) {
            this.fat = true;
        }
    }
}
