package day13;

public interface InterfaceC extends InterfaceA, InterfaceB{
    void methodC();

    @Override
    default void defaultMethod() {
        InterfaceB.super.defaultMethod();
    }
}
