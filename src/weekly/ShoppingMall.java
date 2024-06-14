package weekly;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingMall extends Product {
    List<Product> productList = new ArrayList<>();

    public ShoppingMall(String productName, int price, int stock, List<Product> productList) {
        super(productName, price, stock);
        this.productList = productList;
    }

    // 제품 추가
    public void setProductList(String productName, int price, int stock) {


    }

    public void setProductList(String productName) {
        getProductList();

    }

    // 제품 목록 출력
    public void setProductList() {
        this.productList = productList;
    }

    public void getProductList(){
        return;
    }

    public abstract boolean checkOrderAvailability();
}
