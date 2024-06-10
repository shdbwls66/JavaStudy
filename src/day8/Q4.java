package day8;

public class Q4 {
  public static void main(String[] args) {
    System.out.println(isCool(22));
    System.out.println(isCool(23));
    System.out.println(isCool(24));
  }

  public static boolean isCool(int num) {
    if (num >= 0) {
      return (num % 11 == 0) || (num % 11 == 1);
    }
    return false;
  }
}
