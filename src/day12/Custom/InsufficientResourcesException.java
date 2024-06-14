package day12.Custom;

// 커스텀 익셉션
public class InsufficientResourcesException extends Exception {
  public InsufficientResourcesException(String message) {
    super(message);
  }
}
