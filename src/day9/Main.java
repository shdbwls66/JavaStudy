package day9;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 계좌 생성
    System.out.println("계좌번호를 입력하세요: ");
    String accountNumber = scanner.nextLine();

    System.out.println("소유자 이름을 입력하세요: ");
    String ownerName = scanner.nextLine();

    BankAccount account = new BankAccount(accountNumber, ownerName);

    account.deposit(100000);
    account.withdraw(50000);
    account.withdraw(150000);

    account.printBalance();

    scanner.close();
  }
}
