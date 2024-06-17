package day13;

public interface InterfaceB {
  void methodB();

  default void defaultMethod() {
    System.out.println("디폴트 B");
  }
}
