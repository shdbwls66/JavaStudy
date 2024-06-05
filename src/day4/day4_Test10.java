package day4;

public class day4_Test10 {
  public static void main(String[] args) {
    // 1
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Ecellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fall");
        break;
      default:
        System.out.println("error");
        break;
    }
    // 2
    char operator = '+';
    int num1 = 20, num2 = 10;

    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
      default:
        System.out.println("오류");
        break;
    }

    // 3번
    String color = "red";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
      default:
        System.out.println("error");
    }

    // 4번
    int score = 0;
    switch (score / 10) {
      case 10:
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }

    // 5번
    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java");
        break;
      case "Python":
        System.out.println("Python");
        break;
      case "C++":
        System.out.println("C++");
        break;
      case "JavaScript":
        System.out.println("JavaScript");
        break;
      default:
        System.out.println("목록에 없는 코드!");
        break;
    }
  }
}
