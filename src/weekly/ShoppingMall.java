package weekly;

public abstract class ShoppingMall {
  private String[] products;
  private int count;

  public ShoppingMall(int capacity) {
    products = new String[capacity];
    this.count = 0;
  }

  public void addProduct(Product product) {
    if (count == products.length) {
      String[] newProducts = new String[products.length*2];
      for (int i = 0; i < products.length; i++) {
        newProducts[i] = products[i];
      }
      products = newProducts;
    }
    for (int i = 0; i < products.length; i++) {
      if (products[i] == null) {
        products[i] = product.getProductName();
        count++;
        System.out.println(products[i] + " 추가");
        break;
      }
    }
  }

  public void removeProduct(Product product) {
    for(int i = 0; i < products.length; i++) {
      if(products[i].equals(product.getProductName())) {
        System.out.println(products[i] + "삭제");
        products[i] = null;
        break;
      }
    }
    count--;
  }

  public void removeProduct(ShoppingMall shoppingMall, int index) {
    System.out.println(shoppingMall.products[index] + "삭제");
    shoppingMall.products[index] = null;
    count--;
  }

  public void displayProducts() {
    for (String list : products) {
      System.out.println(list);
    }
  }

  public abstract boolean checkOrderAvailability(Product product);
}
