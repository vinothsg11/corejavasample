package reflections;

import java.lang.reflect.Method;

import beanPackage.Company;

public class InvokeMethodDynamically {

  public static void main(String[] args) {
    Company company = new Company();
    Method method;
    try {
      method = company.getClass().getMethod("prntTest", new Class<?>[0]);
      method.invoke(company);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
