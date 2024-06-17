package weekly;

public class Electronics extends Product {
  private String brand;

  public Electronics(String productName, int price, int stock, String brand) {
    super(productName, price, stock);
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public int calculatePrice() {
    return this.brand.equals("Apple") ? getPrice() + (1 + (20 / 100)) : getPrice();
  }
}
