package day8;

public class 재귀함수 {
  public static void main(String[] args) {
    System.out.println(printAt("helloWorld")); // "h@e@l@l@o"
  }

  static String printAt(String str) {
//    int i = 0;
//    String result = "";
//
//    while (i < str.length() - 1) {
//      result += str.charAt(i) + "@";
//      i++;
//    }
//    result += str.charAt(i);
//
//    return result;

        if(str.length() <= 1){
          return str;
        }

        return str.charAt(0)+"@" + printAt(str.substring(1));
  }
}
