package day8;

public class Q7 {
  public static void main(String[] args) {
    System.out.println(repeatChar("The"));
    System.out.println(repeatChar("AAbb"));
    System.out.println(repeatChar("Hi-There"));
  }

  public static String repeatChar(String str) {
    int i = 0;
    String result = "";

    while (i < str.length()) {
      // 참조타입과 원시타입을 같이 연산할 때 의도된 값으로 나오지 않음
      String character = String.valueOf(str.charAt(i));
      result += character + character;
      i++;
    }

    return result;
  }
}
