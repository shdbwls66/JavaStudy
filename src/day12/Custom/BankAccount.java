package day12.Custom;

public class BankAccount {
  private int balance;

  public void withdraw(int amount) throws InsufficientResourcesException {
    if (balance < amount) {
      throw new InsufficientResourcesException("잔액이 부족합니다.");
    }
    balance -= amount;
  }


}
