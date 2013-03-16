public class Account {
  private double balance;

  public Account(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= amount;
  }

  public double getBalance() {
    return balance;
  }
}
