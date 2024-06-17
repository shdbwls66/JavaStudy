package weekly;

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
  int calculatePrice(){
    return this.size.contains("L") ? getPrice() + (1 + (10/100)) : getPrice();

  }
}
