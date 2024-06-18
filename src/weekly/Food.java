package weekly;

public class Food extends Product implements ProductList {
  private int expirationDate;

  public Food(String productName, int price, int stock, int expirationDate) {
    super(productName, price, stock);
    this.expirationDate = expirationDate;
  }

  public void setExpirationDate(int expirationDate) {
    this.expirationDate = expirationDate;
  }

  public int getExpirationDate() {
    return expirationDate;
  }

  @Override
  double calculatePrice(){
      return getExpirationDate() <= 7 ? getStock() * (getPrice() - (getPrice() * 0.2)) : getStock() * getPrice();
  }

  @Override
  public void displayProducts() {
    System.out.println(getProductName() +": " + getExpirationDate());
  }
}
