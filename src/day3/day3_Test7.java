package day3;

public class day3_Test7 {
  public static void main(String[] args) {
    String[] category = {"에스프레소류", "블랜디드류", "라떼류"};
    String name1 = "아메리카노";
    int price1 = 1500;

    String name2 = "바닐라라떼";
    int price2 = 3500;

    String format = String.format("%s의 가격은 %s원 이고 %s 상품입니다", name1, price1, category[0]);
    String format1 = String.format("%s의 가격은 %s원 이고 %s 상품입니다", name2, price2, category[0]);

    System.out.println(format);
    System.out.println(format1);
  }
}
