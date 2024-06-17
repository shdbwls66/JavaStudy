package day12.Animal;

public class Deer extends Animal implements Herbivore {

    @Override
    public String getFood() {
        return "apple";
    }
}
