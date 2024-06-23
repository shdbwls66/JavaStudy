package weekly.weekly02;

public class Product {
  private String productName;
  private int price;
  private int stock;

  public Product(String productName, int price, int stock) {
    this.productName = productName;
    this.price = price;
    this.stock = stock;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  double calculatePrice() {
    return this.price;
  }
}
