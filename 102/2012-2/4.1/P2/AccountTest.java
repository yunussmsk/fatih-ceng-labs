import java.util.Scanner;

public class AccountTest {
  private static Scanner s = new Scanner(System.in);
  private static Account account = new Account(0);

  public static void main(String[] args) {

    while (true) {
      displayMenu();
      int input = s.nextInt();
      switch (input) {
        case 1: displayBalance(); break;
        case 2: deposit(); break;
        case 3: withdraw(); break;
        default: goodbye(); return;
      }
    }
  }

  private static void displayMenu() {
    System.out.println("1. Display balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("0. Exit");
    System.out.print("Choose an item [1230]: ");
  }

  private static void displayBalance() {
    System.out.println("Balance:" + account.getBalance());
  }

  private static void deposit() {
    System.out.println("Enter deposit amount: ");
    account.deposit(s.nextDouble());
  }

  private static void withdraw() {
    System.out.println("Enter withdraw amount: ");
    account.withdraw(s.nextDouble());
  }

  private static void goodbye() {
    System.out.println("Goodbye!");
  }
}
