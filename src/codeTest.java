public class codeTest {
  public static void main(String[] args) {
    System.out.println(getMiddleThree("덮밥"));
  }

  //  public class MyClass {
  //    public static int staticNum = 0;
  //
  public static String getMiddleThree(String str) {
    String result = str;
    if (str.length() >= 3) {
      int firstIndex = str.length() / 2 - 1;
      result = str.substring(firstIndex, firstIndex + 3);
    }

    return result;
  }
  //  }

  // static => 클래스 계열의 필드와 메서드를 정의할 때 사용하는 키워드
  // 클래스 레벨 => 인스턴스에 속하는게 X
}
