import java.util.stream.IntStream;

public class day5_Test2 {
  public static void main(String[] args) {
    //        for (int i = 1; i < 5; i++) {
    //          System.out.println("현재 i의 값은 = " + i);
    //        }

    //        1부터 100까지 짝수의 합
    //        int sum = 0;
    //        for (int i = 1; i <= 100; i++) {
    //          if (i % 2 == 0) {
    //            sum += i;
    //          }
    //        }
    //        System.out.println(sum);
    //
    //        int hap = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
    //        System.out.println(hap);

    //    3의 배수이면서 5의 배수인 수의 합
    //    int sum1 = 0;
    //    for (int n = 1; n <= 20; n++) {
    //      if (n % 3 == 0 && n % 5 == 0) {
    //        sum1 += n;
    //      }
    //    }
    //    System.out.println(sum1);

    //    피보나치 이론
    //    int[] arr = new int[10];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //
    //    for (int n = 2; n < arr.length; n++) {
    //      arr[n] = arr[n - 2] + arr[n - 1];
    //    }
    //
    //    for (int i : arr) {
    //      System.out.println(i);
    //    }


    // 0부터 -100까지 짝수만 출력
    //    for (int i = 0; i >= -100; i--) {
    //      if (i % 2 == 0) {
    //        System.out.println(i);
    //      }
    //    }

    // 2단
    //    int i;
    //    int n;
    //    for (i = 1; i <= 9; i++) {
    //      n = 2 * i;
    //      System.out.println("2 * " + i + " = " + n);
    //    }

    // 구구단
//        int i;
//        int j;
//        int result;
//
//        for (i = 2; i < 10; i++) {
//          for (j = 1; j < 10; j++) {
//            result = i * j;
//            System.out.println(i + " * " + j + " = " + result);
//          }
//        }

    // 구구단 19단
        int i;
        int j;
        int result;

        for (i = 19; i > 0; i--) {
          for (j = 19; j > 0; j--) {
            result = i * j;
            System.out.println(i + " * " + j + " = " + result);
          }
        }

  }
}
