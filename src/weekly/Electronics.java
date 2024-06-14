package weekly;

public class Electronics extends Product {
  String brand;

  public Electronics(String productName, int price, int stock, String brand) {
    super(productName, price, stock);
    this.brand = brand;
  }

  @Override
  public int calculatePrice() {
    this.price = this.brand == "Apple" ? price + (1 + (20 / 100)) : price;
    return this.price;
  }
}
