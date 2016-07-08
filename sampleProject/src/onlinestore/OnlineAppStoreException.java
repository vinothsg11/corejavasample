package onlinestore;

//add variable/properties errorNumber, errorType, errorDescription
//add 3 constructors
//add getter setter methods
public class OnlineAppStoreException extends Exception {
  private String errorNumber;
  private String errorType;
  private String errorDescription;

  OnlineAppStoreException(String errorNumber) {
    this.errorNumber = errorNumber;
  }

  OnlineAppStoreException(String errorNumber, String erroType) {
    this.errorNumber = errorNumber;
    this.errorType = errorType;
  }

  OnlineAppStoreException(String errorNumber, String erroType, String erroDescription) {
    this.errorNumber = errorNumber;
    this.errorType = errorType;
    this.errorDescription = erroDescription;
  }

  public String getErrorNumber() {
    return errorNumber;
  }

  public void setErrorNumber(String errorNumber) {
    this.errorNumber = errorNumber;
  }

  public String getErrorType() {
    return errorType;
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

}