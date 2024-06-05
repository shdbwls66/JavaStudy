import java.util.Scanner;

public class day6_Test2 {
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);

    //    System.out.println("정수를 입력해주세요.");
    //    int a = sc.nextInt();
    //
    //    System.out.println("제가 입력한 값은 " + a + " 입니다.");

    //    System.out.println("메세지를 입력하세요");
    //    String b = sc.nextLine();
    //
    //    System.out.println(b + "입력");
    //
    //    sc.close();

    Scanner sc = new Scanner(System.in);

    System.out.println("숫자를 입력하세요.");
    int number = sc.nextInt();

    switch (number) {
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      case 4:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
        break;
    }

    sc.close();
  }
}
