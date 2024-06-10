package day8;

public class Q3 {
  public static void main(String[] args) {
    System.out.println(isOrdered(3, 2, 3, false));
  }

  public static boolean isOrdered(int first, int second, int third, boolean opt) {
    if (!opt) {
      return (first < second) && (second < third);
    }
    return (second < third);
  }
}
