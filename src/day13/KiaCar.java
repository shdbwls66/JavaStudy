package day13;

public class KiaCar implements Car {
    @Override
    public String showEngine() {
        return "engine";
    }

    @Override
    public int amountNavi() {
        return 200;
    }

    @Override
    public String getTier() {
        return "타이어";
    }
}
