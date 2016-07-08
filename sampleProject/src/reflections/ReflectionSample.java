package reflections;

import beanPackage.Company;

public class ReflectionSample {
  public static void main(String[] args) {
    Company company = new Company();
    System.out.println(company.getClass().getName());
  }
}
