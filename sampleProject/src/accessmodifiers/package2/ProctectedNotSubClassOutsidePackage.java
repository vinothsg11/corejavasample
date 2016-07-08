package accessmodifiers.package2;

import accessmodifiers.package1.StudentDetail;

public class ProctectedNotSubClassOutsidePackage {
  public static void main(String[] args) {
    StudentDetail studentDetail = new StudentDetail();
    studentDetail.setStudentAge(10);
    studentDetail.setStudentName("JavaStudent");
    studentDetail.setStudentAddress("North Street3, Singapore");
    // Student Age variable is not visible
    System.out.println(studentDetail.getStudentAge());
    System.out.println(studentDetail.getStudentName());
    System.out.println(studentDetail.studentAddress);
  }
}