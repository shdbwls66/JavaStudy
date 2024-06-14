package weekly;

public class Product {
    String productName;
    int price;
    private int stock;

    public Product(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

//    public String getProductName() {
//        return productName;
//    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    int calculatePrice(){
        return this.price;
    }

}
