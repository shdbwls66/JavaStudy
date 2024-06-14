package weekly;

public class Clothing extends Product {
  String size;

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
    int result = getSize().contains("L") ? getPrice() + (1 + (10/100)) : getPrice();
    setPrice(result);
    return this.price;
  }
}
