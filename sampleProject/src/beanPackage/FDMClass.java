package beanPackage;

public class FDMClass {
  String courseName;
  String courseDescription;
  public static final int MAX_ALLOWED_STUDENT = 10;
  Student[] studentList = new Student[MAX_ALLOWED_STUDENT];

  public Student[] getStudentList() {
    return studentList;
  }

  public void setStudentList(Student[] studentList) {
    this.studentList = studentList;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseDescription() {
    return courseDescription;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }

}
