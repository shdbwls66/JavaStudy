package day4;

public class day4_Test {
  public static void main(String[] args) {

    int number1 = 10;
    int number2 = 3;

    int sum = number1 + number2;
    int diff1 = number2 - number1;
    int diff2 = number1 - number2;

    int product = number1 * number2;
    int quot = number1 / number2;
    int remainder = number1 % number2;

    System.out.println("덧셈: " + sum);
    System.out.println("뺄셈1: " + diff1);
    System.out.println("뺄셈2: " + diff2);
    System.out.println("곱셈: " + product);
    System.out.println("나눗셈: " + quot);
    System.out.println("나머지: " + remainder);

    int a = 1;
    long b = 2;
    long c = a + b;

    int d = 10;
    int e = 4;
    int f = d/e;
    double g = (double) a/b;

    char c1 = 'A' + 1;
    char c2 = 'A';
    int c3 =  c2 + 1;
  }
}
