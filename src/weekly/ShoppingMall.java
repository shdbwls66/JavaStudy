package weekly;

public class ShoppingMall extends Product {
  Product[] productList;
  int count;

  public ShoppingMall(String productName, int price, int stock, int listSize) {
    super(productName, price, stock);
    this.productList = new Product[listSize];
    this.count = 0;
  }

  public void addProduct(Product product) {
    if (count == productList.length) {
      Product[] newProductList = new Product[productList.length * 2];
      for (int i = 0; i < productList.length; i++) {
        newProductList[i] = productList[i];
      }
    }
    productList[count++] = product;
  }

  public void removeProduct(Product product){
      productList[count--] = null;

  }

  public void displayProducts(){
    for (Product list: productList){
      System.out.println(list);
    }
  }

//  public abstract boolean checkOrderAvailability();
}
