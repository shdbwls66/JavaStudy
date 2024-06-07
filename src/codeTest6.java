public class codeTest6 {
  public static void main(String[] args) {
    printHello(100);
  }

  static int printHello(int num) {
    if (num == 0) {
      return 0;
    }else{
      System.out.println(num);
      return printHello(num-1);
    }
  }
}
