package day12.Animal;

public class Class {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();

    Tiger tiger = new Tiger();
    tiger = new Tiger();
    zooKeeper.feed(tiger);

    Lion lion = new Lion();
    zooKeeper.feed(lion);

    Rabbit rabbit = new Rabbit();
    zooKeeper.feed2(rabbit);

    Deer deer = new Deer();
    zooKeeper.feed2(deer);
  }
}
