package test;
//create BankTransaction

// add variable balanceAmount , use float or double
//add method deposit to increase the balanceAmount
//add method withdraw to decrease the balanceAmount
//add method to print the remaining balanceAmount.
//create one instance of BankTransaction
//Deposit 100,500,750
//withdraw 350
//Print the final amount

import java.math.RoundingMode;
import java.text.DecimalFormat;

abstract class BankTransaction {
  static Double MAXIMUM_AMOUNT;
  static {
    System.out.println("Static Block");
    MAXIMUM_AMOUNT = 1000000.00;
  }
  Double balanceAmount = 0.00;

  static Double getDepoistAmountLimit() {
    return MAXIMUM_AMOUNT;
  }

  BankTransaction() {

    balanceAmount = 10.00;
    System.out.println("Super class contructor");
  }

  BankTransaction(Double balanceAmount) {
    this.balanceAmount = this.balanceAmount + balanceAmount;
  }

  public void setDeposit(Double amountToDeposit) {
    balanceAmount = balanceAmount + amountToDeposit;
  }

  abstract void setMinimumPayment();

  public void withDraw(Double amountToDeposit) {
    balanceAmount = balanceAmount - amountToDeposit;
  }

  public Double getBalance() {
    return balanceAmount;
  }

  void customFormat(String pattern, double value) {

    for (int i = 9; i < 100; i++) {
      int a = 10;
    }
    int a = 100;

    DecimalFormat myFormatter = new DecimalFormat(pattern);
    myFormatter.setRoundingMode(RoundingMode.HALF_UP);
    String output = myFormatter.format(value);
    System.out.println(value + "  " + pattern + "  " + output);
  }
}

public class Bank {
  public static void main(String[] args) {
    // BankTransaction bankTransactionNew = new BankTransaction();
    // System.out.println("Total banlance ->" + bankTransactionNew.balanceAmount);
    //
    // // TODO Auto-generated method stub
    // BankTransaction bankTransaction = new BankTransaction(1500.80);
    // System.out.println("Total banlance ->" + bankTransaction.balanceAmount);
    // // customFormat("###,###.###", 123456.789);
    // // customFormat("###.##", 123456.789);
    // // customFormat("000000.000", 123.78);
    // // customFormat("$###,###.###", 12345.67);
    // bankTransaction.customFormat("###,###.###", bankTransaction.balanceAmount);
  }
}
