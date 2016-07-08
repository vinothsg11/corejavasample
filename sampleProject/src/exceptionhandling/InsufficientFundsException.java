package exceptionhandling;

/**
 * Created by user on 6/20/2016.
 */
// 1. ResultDataException
//

public class InsufficientFundsException extends Exception {
  private double amount;
  private String errorNumber;
  private String errorDescription;

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setErrorNumber(String errorNumber) {
    this.errorNumber = errorNumber;
  }

  public InsufficientFundsException(double amount) {
    super();
    this.amount = amount;
  }

  public InsufficientFundsException(String errorDescription) {
    super(errorDescription);
    this.errorDescription = errorDescription;
  }

  public InsufficientFundsException(String errorNumber, double amount) {
    this.errorNumber = errorNumber;
    this.amount = amount;
  }

  public InsufficientFundsException(String errorNumber, double amount, String errorDescription) {
    this.errorDescription = errorDescription;
    this.errorNumber = errorNumber;
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public String getErrorNumber() {
    return errorNumber;
  }
}
