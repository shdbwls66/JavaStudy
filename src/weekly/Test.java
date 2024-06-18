package weekly;

public class Test {
  public static void main(String[] args) {

    // cloth 몰 생성
    PremiumShoppingMall clothingMall = new PremiumShoppingMall(3);

    // cloth 상품 생성
    Clothing pants = new Clothing("pants", 1000, 20, "XS");
    Clothing jacket = new Clothing("jacket", 2000, 10, "XL");

    // cloth 몰에 추가
    clothingMall.addProduct(pants);
    clothingMall.addProduct(jacket);
    clothingMall.displayProducts();

    System.out.println("==============================");

    System.out.println(clothingMall.checkOrderAvailability(pants));

    System.out.println("==============================");

    System.out.println(jacket.calculatePrice());

    System.out.println("==============================");
    System.out.println("==============================");

    PremiumShoppingMall electronicMall = new PremiumShoppingMall(3);
    Electronics mac = new Electronics("mac", 3000, 33, "Apple");
    electronicMall.addProduct(mac);
    electronicMall.displayProducts();

    System.out.println("==============================");

    System.out.println(electronicMall.checkOrderAvailability(mac));

    System.out.println("==============================");
    System.out.println("==============================");

    PremiumShoppingMall foodMall = new PremiumShoppingMall(3);

    Food milk = new Food("milk", 2500, 10, 8);
    Food cocaCola = new Food("cocaCola", 1500, 5, 10);
    Food gimbap = new Food("gimbap", 2500, 5, 2);
    Food gimbap2 = new Food("gimbap2", 3500, 10, 8);

    foodMall.addProduct(milk);
    foodMall.addProduct(cocaCola);
    foodMall.addProduct(gimbap);
    foodMall.addProduct(gimbap2);
    foodMall.displayProducts();

    System.out.println("==========================");

    foodMall.removeProduct(gimbap);
    foodMall.displayProducts();

    System.out.println("==========================");

    Food hamburger = new Food("hamburger", 5200, 10, 10);
    foodMall.addProduct(hamburger);
    foodMall.displayProducts();

    System.out.println("==========================");

    foodMall.removeProduct(foodMall, 0);
    foodMall.displayProducts();
  }
}
