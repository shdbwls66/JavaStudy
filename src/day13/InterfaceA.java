package day13;

public interface InterfaceA {
  void methodA();

  default void defaultMethod() {
    System.out.println("디폴트 A");
  }
}
