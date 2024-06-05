package day4;

public class day4_Test4 {
  public static void main(String[] args) {
//    System.out.println(true ^ !true);
//    System.out.println(true ^ !false);
//    System.out.println(false ^ !true);
//    System.out.println(false ^ !false);
    //     i는 2의 배수이면서 3의 배수
    //        i%2==0 && i%3==0
    //     x는 30의 배수이면서 2의 배수이거나 5의 배수
//    int x = 60;
//    System.out.println((x % 30 == 0) && ((x % 2 == 0) || (x % 5 == 0)));

    System.out.println(1 ^ ~1);
    System.out.println(1 ^ ~0);
    System.out.println(0 ^ ~1);
    System.out.println(0 ^ ~0);

    //    2진수를 10진수로
    //    (0 * 2^0) + (1 * 2^1) + (0 * 2^2) + (1 * 2^3)
    int b = -8;
    System.out.println(b >>> 2);
  }
}
