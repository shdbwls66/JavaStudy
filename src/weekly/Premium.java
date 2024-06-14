package weekly;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Premium extends ShoppingMall{

    public Premium(String productName, int price, int stock, List<Product> productList) {
        super(productName, price, stock, productList);
    }

    @Override
    public boolean checkOrderAvailability() {
        return getStock() >= 10;
    }
}
