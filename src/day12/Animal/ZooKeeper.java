package day12.Animal;

public class ZooKeeper {

  void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }

  void feed2(Herbivore herbivore) {
    System.out.println("feed " + herbivore.getFood());
  }
}
