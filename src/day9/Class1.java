package day9;

public class Class1 {
  public static void main(String[] args) {
    Class2 okaytest = new Class2();

    //    okaytest.add(); // private 타입이므로 여기서 못 씀

    System.out.println(okaytest.b);
    System.out.println(okaytest.good());

    Class2.call(); // static으로 함수 선언되어서 인스턴스 안 만들어도 호출 가능
    //    Class2.good(); // static 없이 함수 선언, 에러남

  }
}
