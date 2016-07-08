package test;

public class AgencyTransaction extends BankTransaction {
  private String agencyType;
  private String agencyName;

  AgencyTransaction() {
    super();
    this.agencyType = "Banking";
    System.out.println("Agency Transaction Constructor");
  }

  public String getAgencyType() {
    return agencyType;
  }

  public void setAgencyType(String agencyType) {
    this.agencyType = agencyType;
  }

  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  @Override
  void setMinimumPayment() {
    balanceAmount = 150.00;
  }

}
