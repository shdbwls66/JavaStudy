package day11;

public class DogAbstract extends AnimalAbstract {

  public DogAbstract() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("월월");
  }
}
