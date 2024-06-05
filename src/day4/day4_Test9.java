package day4;

public class day4_Test9 {
  public static void main(String[] args) {

//        int data = 10;
//
//        switch (data) {
//          case 1:
//            System.out.println("1입니다");
//            break;
//          case 2:
//            System.out.println("2입니다");
//            break;
//          case 10:
//            System.out.println("10입니다");
//            break;
//          default:
//            System.out.println("d");
//            break;
//        }

    String day = "수요일";

    switch (day) {
      case "월요일":
        System.out.println("노래듣기");
        break;
      case "화요일":
        System.out.println("커피마시기");
        break;
      case "수요일":
        System.out.println("악기 뚱땅거리기");
        break;
      case "목요일":
        System.out.println("게임하기");
        break;
      case "금요일":
        System.out.println("술마시기");
        break;
      case "토요일":
        System.out.println("누워있기");
        break;
      case "일요일":
        System.out.println("폰만지기");
        break;
      default:
        System.out.println("알 수 없는 요일");
        break;
    }
  }
}
