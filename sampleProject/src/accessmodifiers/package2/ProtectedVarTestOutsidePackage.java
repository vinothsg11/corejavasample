package accessmodifiers.package2;

import accessmodifiers.package1.ProtectedVarTest;
import accessmodifiers.package1.StudentDetail;

/**
 * Created by user on 6/17/2016.
 */
public class ProtectedVarTestOutsidePackage extends StudentDetail {

  public static void main(String[] args) {
    ProtectedVarTestOutsidePackage protectedVarTestOutsidePackage = new ProtectedVarTestOutsidePackage();
    protectedVarTestOutsidePackage.studentAddress = "procted address";
    protectedVarTestOutsidePackage.studentName = "protected student name";
    protectedVarTestOutsidePackage.setStudentAge(10);

    System.out.println(protectedVarTestOutsidePackage.getStudentAge());
    System.out.println(protectedVarTestOutsidePackage.studentName);
    System.out.println(protectedVarTestOutsidePackage.studentAddress);

    ProtectedVarTest protectedVarTest = new ProtectedVarTest();
    protectedVarTest.studentAddress = "procted address";
    protectedVarTest.setStudentName("Second Student Name");
    protectedVarTest.setStudentAge(10);

    System.out.println(protectedVarTest.getStudentAge());
    System.out.println(protectedVarTest.getStudentName());
    System.out.println(protectedVarTest.studentAddress);
  }
}
