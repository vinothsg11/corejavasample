package accessmodifiers.package1;

/**
 * Created by user on 6/17/2016.
 */
public class PrivateVarTest {
  public static void main(String[] args) {
    StudentDetail studentDetail = new StudentDetail();
    studentDetail.setStudentAge(10);
    studentDetail.setStudentName("JavaStudent");
    studentDetail.setStudentAddress("North Street3, Singapore");
    // Student Age variable is not visible
    System.out.println(studentDetail.getStudentAge());
    System.out.println(studentDetail.studentName);
    System.out.println(studentDetail.studentAddress);
  }
}
