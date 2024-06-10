package day8;

public class Q5 {
  public static void main(String[] args) {
    System.out.println(secomDalcom(15));
    System.out.println(secomDalcom(3));
    System.out.println(secomDalcom(5));
    System.out.println(secomDalcom(2));
  }

  static String secomDalcom(int n) {

    boolean secom = n % 3 == 0;
    boolean dalcom = n % 5 == 0;

    if (secom && dalcom) return "새콤달콤!";
    if (secom) return "새콤!";
    if (dalcom) return "달콤!";

    return n + "!";
  }
}
