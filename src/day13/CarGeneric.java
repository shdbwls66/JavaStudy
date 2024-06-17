package day13;

public class CarGeneric<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public boolean isIns(){
        return t instanceof Boolean;
    }


}
