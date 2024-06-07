import org.w3c.dom.ls.LSOutput;

public class codeTest2 {
  public static void main(String[] args) {
    System.out.println(barkingDogProblem(true, 9));
  }

  static String barkingDogProblem(boolean barking, int hour) {
    if (barking && (hour < 7 || hour > 20)) {
      return "짖으면 안돼!!";
    } else {
      return "든든하군!";
    }

    // return barking && (hour < 7 || hour > 20) ? "짖으면 안돼!!" : "든든하군!";
  }
}

