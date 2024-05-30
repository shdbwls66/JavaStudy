public class day2_Test7 {
  public static void main(String[] args) {
    int a = 10; // 원시타입은 stack 으로 슝~
    int[] arr = new int[5]; // 참조타입은 heep 으로 슝~

    String[] arr2 = new String[5];
    System.out.println(arr2[0]);

    String name = "sung yeon";
    String name2 = new String("sung yeon");
    System.out.println(name);
    System.out.println(name2);
  }
}
