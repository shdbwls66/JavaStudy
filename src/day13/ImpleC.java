package day13;

public class ImpleC implements InterfaceC {
  @Override
  public void methodC() {
    System.out.println("C실행");
  }

  @Override
  public void methodA() {
    System.out.println("A실행");
  }

  @Override
  public void methodB() {
    System.out.println("B실행");
  }

  public void callMethod(){
    defaultMethod();
  }
}
