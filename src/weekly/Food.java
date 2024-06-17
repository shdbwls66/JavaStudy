package weekly;

public class Food extends Product {
  private int expirationDate;

  public Food(String productName, int price, int stock, int expirationDate) {
    super(productName, price, stock);
    this.expirationDate = expirationDate;
  }

  public int getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(int expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public int calculatePrice(){
      return this.expirationDate <= 7 ? getPrice() - (1 + (20 / 100)) : getPrice();
  }
}
