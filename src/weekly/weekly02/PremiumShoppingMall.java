package weekly.weekly02;

public class PremiumShoppingMall extends ShoppingMall{

    public PremiumShoppingMall(int capacity) {
        super(capacity);
    }

    @Override
    public boolean checkOrderAvailability(Product product) {
        return product.getStock() >= 10;
    }
}
