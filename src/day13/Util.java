package day13;

public class Util {
    public static <T> Box<T> boxing(T t){
        Box<T> tBox = new Box<>();
        tBox.set(t);
        return tBox;
    }
}
