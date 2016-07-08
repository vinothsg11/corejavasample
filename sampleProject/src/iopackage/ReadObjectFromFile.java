package iopackage;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import beanPackage.Company;

public class ReadObjectFromFile {
  public static void main(String[] args) {
    FileInputStream fis = null;
    String file = "C://vinoth//course//out.dat";
    ObjectInputStream objectInput;
    try {
      fis = new FileInputStream(file);
      objectInput = new ObjectInputStream(fis);
      Company company = (Company) objectInput.readObject();
      System.out.println("company name ->" + company.getCompanyName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
