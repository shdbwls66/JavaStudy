public class day5_Test3 {
  public static void main(String[] args) {
//    int number = 0;
//    while (number < 10) {
//      System.out.println("현재 숫자: " + number);
//      if (number == 5) {
//        System.out.println("5가 되었습니다.");
//        break;
//      }
//      number++;
//    }
//
//    for (int i = 0; i < 10; i++) {
//      System.out.println("현재 숫자: " + i);
//      if (i == 5) {
//        break;
//      }
//    }
//
//    for(int i = 0; i < 10; i++) {
//      System.out.println("현재 i의 값은 = " +i);
//      for(int j = 0; j < 10; j++) {
//        System.out.println("현재 j의 값은 = " +j);
//        if (j == 5) {
//          break;
//        }
//      }
//    }

    // 이중 for문 만들기. i는 1~100, j는 2~100
    // i가 50일 때 break, j는 80일 때 break;

    int i, j;
    for(i = 1; i <= 100; i++) {
      System.out.println("현재 i값: " + i);
      if (i == 50) {
        break;
      }
      for(j = 2; j <= 100; j++) {
        System.out.println("현재 j값: " + j);
        if (j==80) {
          break;
        }
      }
    }

  }
}
