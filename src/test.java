public class test {
  public static void main(String[] args) {
    System.out.println(solution("banana", "ba"));
  }

  public static int solution(String my_string, String is_prefix) {

    int str = my_string.indexOf(is_prefix);

    if (str == 0) {
      return 1;
    } else {
      return 0;
    }
  }
}
