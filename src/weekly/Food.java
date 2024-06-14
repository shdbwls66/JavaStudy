package weekly;

public class Food extends Product {
  int expirationDate;

  public Food(String productName, int price, int stock, int expirationDate) {
    super(productName, price, stock);
    this.expirationDate = expirationDate;
  }

  @Override
  public int calculatePrice(){
    this.price = this.expirationDate <= 7 ? price - (1 + (20 / 100)) : price;
    return this.price;
  }
}
