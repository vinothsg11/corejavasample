package beanPackage;

public class Student {
  String studentName;
  String studentRollNumber;
  FDMClass courseDetail;

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getStudentRollNumber() {
    return studentRollNumber;
  }

  public void setStudentRollNumber(String studentRollNumber) {
    this.studentRollNumber = studentRollNumber;
  }

  public FDMClass getCourseDetail() {
    return courseDetail;
  }

  public void setCourseDetail(FDMClass courseDetail) {
    this.courseDetail = courseDetail;
  }

  @Override
  public int hashCode() {
    return studentName.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null) {
      Student studenToCheck = (Student) obj;
      if (this.getStudentName().equals(studenToCheck.getStudentName())) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

  @Override
  public Object clone() {
    Student student;
    student = new Student();
    return student;
  }
}
