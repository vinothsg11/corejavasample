package beanPackage;

/**
 * User class to manage user details for a specific company. password storing uses hashcode.
 * 
 * @author user
 *
 */
public class User {
  String userName;
  String password;
  boolean statusOfTheAccount;
  Company company;

  /**
   * Method that returns company
   * 
   * @return Company
   */
  public Company getCompany() {
    return company;
  }

  /**
   * Method to set Company.
   * 
   * @param company
   */
  public void setCompany(Company company) {
    this.company = company;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isStatusOfTheAccount() {
    return statusOfTheAccount;
  }

  public void setStatusOfTheAccount(boolean statusOfTheAccount) {
    this.statusOfTheAccount = statusOfTheAccount;
  }
}
