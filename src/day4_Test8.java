public class day4_Test8 {
  public static void main(String[] args) {

        int a = 10;
        int b = 5;

        boolean result1 = (a > 5) && (b < 10);
        boolean result2 = (a > 5) || (b > 10);
        boolean result3 = !(a > 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    //    int three = 3;
    //    int five = 5;
    //    int two = 2;
    //
    //    boolean result = (five > three) || (five < two) && (five < three);
    //    System.out.println(result);

    boolean x = true, y = false, z = true;
    System.out.println(y);
    if (x && !y) {
      System.out.println("조건 1 충족");
    }
    if ((y && z) || (!x && !z)) {
      System.out.println("조건 2 충족");
    }
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }
    if (!x && !y && !z) {
      System.out.println("모두 거짓");
    }
  }
}
