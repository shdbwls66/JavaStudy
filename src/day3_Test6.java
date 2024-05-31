public class day3_Test6 {
  public static void main(String[] args) {
    String a = "a:b:c:d";

    String[] split = a.split(":");
    System.out.println(split[0]);

    String result = "Hello";
    System.out.println(result + "!");
    System.out.println("-=========");
//    result = result + "!";
    String concat = result.concat("!");
    System.out.println(concat);
  }
}
