package day4;

public class day4_Test3 {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 30;

    System.out.println(number1 > number2); // false
    System.out.println(number1 >= number2); // false
    System.out.println(number1 <= number2); // true
    System.out.println(number1 < number2); // true

    System.out.println(number2 == number1); // false
    System.out.println(number2 != number1); // true

    System.out.println('A' == 65);
    System.out.println(10 == 10.0);

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");

    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false

    System.out.println(0.1f == 0.1);
    System.out.println(0.1f == (float)0.1);
  }
}
