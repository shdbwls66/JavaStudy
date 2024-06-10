package day8;

public class Q2 {
  public static void main(String[] args) {
    System.out.println(twoSumOne(10, 8, 2));
  }

  public static boolean twoSumOne(int a, int b, int c) {
    return (a + b == c) || (b + c == a) || (a + c == b);
  }
}
