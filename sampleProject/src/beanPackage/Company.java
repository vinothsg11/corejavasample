package beanPackage;

import java.io.Serializable;

public class Company implements Serializable {
  String companyName;
  String registrationNumber;
  User[] companyUser = new User[100];

  public User[] getCompanyUser() {
    return companyUser;
  }

  public void setCompanyUser(User[] companyUser) {
    this.companyUser = companyUser;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public void prntTest() {
    System.out.println("Test");
  }
}
