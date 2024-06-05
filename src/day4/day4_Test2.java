package day4;

public class day4_Test2 {
  public static void main(String[] args) {
    String str = "안녕";
    System.out.println(str + "하세요!");

    System.out.println(123 + 456 + "Hello");
    System.out.println("Hello" + 123 + 456);

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb);
  }
}
