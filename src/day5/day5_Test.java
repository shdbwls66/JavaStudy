package day5;

public class day5_Test {
  public static void main(String[] args) {
    //    10부터 0까지 카운트
    //        int i = 10;
    //        while (i >= 0) {
    //          System.out.println("현재 카운트 " + i);
    //          i--;
    //        }
    //        System.out.println("카운트 종료");

    //        1부터 100까지 합
    //        int n = 0, sum = 0;
    //        while (n <= 100) {
    //          sum += n;
    //          n++;
    //        }
    //        System.out.println(sum);

    //    평균 계산
    //    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    //    int n = 0;
    //    int sum = 0;
    //    while (n < numbers.length) {
    //      sum += numbers[n];
    //      n++;
    //    }
    //    System.out.println(sum / numbers.length);

    //    3의 배수 출력
//    int i = 0;
//    while (i <= 300) {
//      if (i % 3 == 0) {
//        System.out.println(i);
//      }
//      i++;
//    }

//    최대값 구하기
//    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
//    int max = numbers[0];
//    int n = 1;
//    while (n < numbers.length) {
//      if (numbers[n]>max){
//        max = numbers[n];
//      }
//      n++;
//    }
//    System.out.println(max);

//    양수 합 음수 합 각각 구하기
    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    int i = 0;
    int sum1 = 0;
    int sum2 = 0;
    while (i < numbers.length) {
      if (numbers[i] > 0) {
        sum1 += numbers[i];
      } else {
        sum2 += numbers[i];
      }
      i++;
    }
    System.out.println("양수의 합: " + sum1);
    System.out.println("음수의 합: " + sum2);
  }
}
