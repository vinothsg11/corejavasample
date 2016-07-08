package test;

public class AgencyDepositTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    AgencyTransaction agencyTransaction = new AgencyTransaction();
    agencyTransaction.setAgencyName("XYZ");
    agencyTransaction.setAgencyType("Finance");
    if (AgencyTransaction.getDepoistAmountLimit() < agencyTransaction.getBalance()) {
      agencyTransaction.setDeposit(15000.00);
    } else {
      System.out.println("No more Deposit allowed");
    }
    agencyTransaction.withDraw(450.00);
    agencyTransaction.customFormat("###,###.###", agencyTransaction.getBalance().doubleValue());
  }
}
