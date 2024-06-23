package weekly.weekly02;

public class Clothing extends Product {
  private String size;

  public Clothing(String productName, int price, int stock, String size) {
    super(productName, price, stock);
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  double calculatePrice(){
    return getSize().contains("L") ? (getPrice() * 1.1) : getPrice();

  }
}
