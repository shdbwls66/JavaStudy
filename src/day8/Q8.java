package day8;

public class Q8 {
  public static void main(String[] args) {
    System.out.println(starSideDel("ab*c*d"));
    System.out.println(starSideDel("ab**cd"));
    System.out.println(starSideDel("a*bc*d"));
  }

  public static String starSideDel(String str) {
    String result ="";
    for(int i = 0; i < str.length(); i++) {
      // 현재 문자가 *일 때
      if (str.charAt(i)=='*'){
        //i++;
        continue;
      }

      // 현재 문자가 *이 아닐 때
      // 현재 인덱스 앞의 값이 *이 아니거나 현재 인덱스 뒤의 값이 *이 아닐 때 result에 값을 추가 해준다
      if ((i == 0 || str.charAt(i-1) != '*') && ( i == str.length()-1 || str.charAt(i+1) != '*')){
        result += String.valueOf(str.charAt(i));
      }
    }

    return result;
  }
}
