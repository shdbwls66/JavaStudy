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
  double calculatePrice() {
    return getBrand().equals("Apple") ? (getPrice() * 1.2) : getPrice();
  }
}
