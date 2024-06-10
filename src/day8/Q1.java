package day8;

public class Q1 {
  public static void main(String[] args) {
    System.out.println(speedRacer(63, true));
  }

  static int speedRacer(int speed, boolean isHoliday) {
    int tax = 0;
    int safeSpeed = 60;
    int dangerSpeed = 80;

    if (isHoliday) {
        safeSpeed += 5;
        dangerSpeed += 5;
    }

    if (speed <= safeSpeed) {
        tax = 0;
    } else if(speed <= dangerSpeed) {
        tax = 100;
    } else {
        tax = 200;
    }

    return tax;
  }
}
