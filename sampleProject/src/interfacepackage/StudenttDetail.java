package interfacepackage;

/**
 * Class & Interface
 */
public class StudenttDetail {

  public static void main(String[] args) {
    StudentInterface studentInterface = (StudentInterface) getStudentDetail();
    System.out.println(studentInterface.getStudentName());
    System.out.println(studentInterface.getStudentAddress());
  }

  static StudentInterface getStudentDetail() {
    Student student = new Student();
    student.setName("Test");
    student.setAddress("address");
    return (StudentInterface) student;
  }
}
