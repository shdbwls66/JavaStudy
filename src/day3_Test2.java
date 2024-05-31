public class day3_Test2 {
  public static void main(String[] args) {
//    String a = "hello";
//    String b = "java";
//    String c = "hello";
//
//    System.out.println(a.equals(b));
//    System.out.println(a.equals(c));
    String a = "hello";
    String b = new String("hello");

    //     참조 타입이라 메모리 주소를 담고 있음
    //     a 주소와 b 주소는 다르므로 false 출력
    System.out.println(a);
    System.out.println(b);
    System.out.println(a.equals(b)); // true
    System.out.println(a==b); // false
  }
}
