import day10.Package;

public class Test {
  public static void main(String[] args) {
    Package pack = new Package();
    System.out.println(pack.firstName); // public


    Car car = new Car();
    car.setSpeed(120);
    System.out.println(car.getSpeed());

  }
}
