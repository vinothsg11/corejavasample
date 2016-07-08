package reflections;

import beanPackage.Company;

public class RefectionToCreateObject {
  public static void main(String[] args) {
    Class<?> c = null;
    try {
      c = Class.forName("beanPackage.Company");
    } catch (Exception e) {
      e.printStackTrace();
    }

    // create instance of "Company"
    Company company = null;

    try {
      company = (Company) c.newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }

    company.prntTest();
  }
}
