import java.util.Random;
import java.util.Scanner;

public class day6_Test4 {
  public static void main(String[] args) {
    Random random = new Random();

    int randomNum = random.nextInt(100) + 1;

    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.println("숫자를 입력하세요");
      int num = scanner.nextInt();

      if (num > randomNum) {
        System.out.println("입력한 숫자보다 낮습니다");
      } else if (num < randomNum){
        System.out.println("입력한 숫자보다 높습니다");
      } else {
        System.out.println("정답입니다");
        break;
      }
    }

    scanner.close();
  }
}
