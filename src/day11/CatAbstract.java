package day11;

public class CatAbstract extends AnimalAbstract {

  public CatAbstract() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("miumiu");
  }
}
