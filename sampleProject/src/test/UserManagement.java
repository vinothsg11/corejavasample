package test;

import beanPackage.Company;
import beanPackage.User;

public class UserManagement {
  static Company company;
  static User user;

  public static void main(String[] args) {
    createCompanyAndUser();
    System.out.println("company list->" + company.hashCode());

  }

  static void createCompanyAndUser() {
    company = new Company();
    company.setCompanyName("FDM");
    company.setRegistrationNumber("R12345678");

    user = new User();
    user.setUserName("firstuser");
    user.setPassword("XXXX");
    user.setCompany(company);
  }
}
