package weekly;

public class Test {
  public static void main(String[] args) {
    //    int counts = 0;
    //    String[] s = {"a","b","c"};
    //    String[] newS = new String[5];
    //    for(int i = 0; i < s.length; i++) {
    //      newS[i] = s[i];
    //    }
    //    System.out.println(newS[1]);
    //    System.out.println(newS.length);

    ShoppingMall a = new ShoppingMall("a", 2, 3,3);

    System.out.println(a.productList);

    a.addProduct(a);
    a.displayProducts();
  }


}
