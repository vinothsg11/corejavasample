package iopackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import beanPackage.Company;

public class SerialiseObjectTest {

  public static void main(String[] args) {
    Company company = new Company();
    company.setCompanyName("TestCompany");
    FileOutputStream fos = null;
    ObjectOutputStream objectOutputStream = null;
    String file = "C://vinoth//course//out.dat";
    try {
      fos = new FileOutputStream(file);
      objectOutputStream = new ObjectOutputStream(fos);
      objectOutputStream.writeObject(company);
      objectOutputStream.close();
      System.out.println("Successfully written to the file");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
