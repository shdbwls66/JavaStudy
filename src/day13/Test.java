package day13;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {

    //    Bird flyingBird = new FlyingBird();
    //    Bird penguin = new Penguin();

//        Box<Integer> boxing = Util.boxing(100);

        CarGeneric<String> strCarGeneric = new CarGeneric<>();

        strCarGeneric.set("hello");
        String str = strCarGeneric.get();
        System.out.println(str);
        System.out.println(strCarGeneric.isIns());

    //    Box<String> stringBox = new Box<>();
    //    Box<Integer> integerBox = new Box<>();
    //    integerBox.set(6);
    //    Integer i = integerBox.get();

    //    ProfileService profileService = new ProfileService();
    //    profileService.saveProfile(new ProfileMemoryRepository());

    //    Car car = new KiaCar();
    //
    //    System.out.println("타이어 이름 : " + car.getTier());
    //    System.out.println("엔진 이름 : " + car.showEngine());
    //    System.out.println("내비 가격 : " + car.amountNavi());

    //        InterfaceC impleC = new ImpleC();

    //        InterfaceA interfaceA = impleC;
    //        interfaceA.methodA();
    //        System.out.println("===================");
    //
    //        InterfaceB interfaceB = impleC;
    //        interfaceB.methodB();
    //        System.out.println("===================");
    //
    //        impleC.methodA();
    //        impleC.methodB();
    //        impleC.methodC();

    //        impleC.defaultMethod();

    ProfileService service = new ProfileService();
    ProfileRepository database = new ProfileDBRepository();
    service.saveProfile(database);
    ProfileRepository memory = new ProfileMemoryRepository();
    service.saveProfile(memory);


    //    Phone applePhone = new ApplePhone();
    //    Phone samsungPhone = new SamsungPhone();
    //
    //    System.out.println(applePhone.call());
    //    System.out.println(samsungPhone.call());
    //
    //    System.out.println(applePhone.answerThePhone());
    //    System.out.println(samsungPhone.answerThePhone());
  }
}
