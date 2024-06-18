package weekly;

import javax.swing.*;

public class Clothing extends Product implements ProductList {
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
    return getSize().contains("L") ? getStock() * (getPrice() * 1.1) : getStock() * getPrice();

  }

  @Override
  public void displayProducts(Clothing clothing) {
    System.out.println(getProductName() + ": " + getSize());
  }
}
