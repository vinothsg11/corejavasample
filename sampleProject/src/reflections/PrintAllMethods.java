package reflections;

import java.lang.reflect.Method;

import beanPackage.Company;

public class PrintAllMethods {
  public static void main(String[] args) {
    try {
      Class c = Company.class;
      Method[] m = c.getDeclaredMethods();
      for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
    } catch (Throwable e) {
      System.err.println(e);
    }
  }

}
