package day12.Animal;

public class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
        return "meet";
    }
}
