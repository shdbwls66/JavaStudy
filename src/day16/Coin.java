package day16;

public class Coin {
  private int value;

  public Coin(int value) {
    this.value = value;
  }

  public int getValue() {
    call1();
    call2();
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public static void call() { // data 영역에 저장
    System.out.println("okay");
  }

  private void call1() {
    System.out.println("call1");
  }

  private void call2() {
    System.out.println("call2");
  }
}
