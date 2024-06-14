package day12.Custom;

public class BankApplication {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    try {
      account.withdraw(10000);
    } catch (InsufficientResourcesException e) {
      System.out.println(e.getMessage());
    }
  }
}
