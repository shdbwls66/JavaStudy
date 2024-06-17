package day12.Animal;

public class Lion extends Animal implements Predator{
    @Override
    public String getFood() {
        return "fish";
    }
}
