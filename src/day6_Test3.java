import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class day6_Test3 {
  public static void main(String[] args) {
    //    Random random = new Random();

    //    boolean i = random.nextBoolean();
    //
    //    System.out.println(i);

    Random random = new Random();

    // 정수형만 추가할 수 있게 리스트 만들기, 요소 추가, 빼기 가능
    ArrayList<Integer> list = new ArrayList<Integer>();

    while (list.size() != 6) {
      int num = random.nextInt(45) + 1;

      // list에 값이 없으면 추가
      if (!list.contains(num)) {
        list.add(num);
      }
    }

    for (int data : list) {
      System.out.println(data);
    }
  }
}
