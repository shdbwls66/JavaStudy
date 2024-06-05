package day4;

public class day4_Test6 {
  public static void main(String[] args) {
    int number = 10;
    if (number > 10) {
      System.out.println("number는 10보다 큽니다");
    } else if (number < 10) {
      System.out.println("number는 10보다 작습니다");
      if (number > 5) {
        System.out.println("number는 5보다 큽니다");
      }
    } else {
      System.out.println("number는 10입니다");
    }
    int a = 10;
    int b = 20;

    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a < b) {
      System.out.println("a is less than b");
    } else {
      System.out.println("a and b are equal");
    }

    // 삼항 연산자
//    String str = (a > b) ? "a is greater than b" : ((a < b) ? "a is less than b" : "a and b are equal");
//    System.out.println(str);
  }
}
