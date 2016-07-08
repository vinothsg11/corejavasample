package test;

import beanPackage.Company;
import beanPackage.User;

public class UserManagementAdvance {
  public static void main(String[] args) {
    Company company = createCompany();
    User user = createUser(company);

    System.out.println("company list->" + company.getCompanyName());

  }

  static Company createCompany() {
    Company company = new Company();
    company.setCompanyName("FDM");
    company.setRegistrationNumber("R12345678");
    return company;

  }

  static User createUser(Company company) {
    User user = new User();
    user.setCompany(company);
    user.setUserName("FDMUser1");
    user.setPassword("password");
    return user;
  }
}