package exceptionhandling;

/**
 * Created by user on 6/20/2016.
 */
public class CheckingAccount {
  private double balance;
  private int number;

  public CheckingAccount(int number) {
    this.number = number;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) throws InsufficientFundsException {
    if (amount <= balance) {
      balance -= amount;
    } else {

      throw new InsufficientFundsException("W001", amount,
          "Amount Withdrwal can not exceed available balance");
    }
  }

  public double getBalance() {
    return balance;
  }

  public int getNumber() {
    return number;
  }
}
