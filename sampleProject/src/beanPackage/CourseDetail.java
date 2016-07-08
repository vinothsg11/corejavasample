package beanPackage;

public class CourseDetail {

  public void addStudentToClass(final FDMClass fdmClass, final Student studentToBeAdded,
      int positionToAdd) {
    fdmClass.getStudentList()[positionToAdd] = studentToBeAdded;
  }

  public Student[] getStudentList(final FDMClass classToGetStudent) {
    return classToGetStudent.getStudentList();
  }

  public void printStudentList(final Student[] studentArray) {
    for (int i = 0; i < studentArray.length; i++) {
      if (studentArray[i] != null) {
        System.out.println("Student Name ->" + studentArray[i].getStudentName());
      }
    }
  }

  public FDMClass createClass(String courseName, String description) {
    FDMClass fdm = new FDMClass();
    fdm.setCourseName(courseName);
    fdm.setCourseDescription(description);
    return fdm;
  }

  public FDMClass createClass() {
    FDMClass fdm = new FDMClass();
    fdm.setCourseName("Oracle");
    fdm.setCourseDescription("To understand the database");
    return fdm;
  }

  public Student createStudent(final FDMClass fdmClass) {
    Student student = new Student();
    student.setStudentName("Xyz");
    student.setStudentRollNumber("12345678");
    student.setCourseDetail(fdmClass);
    return student;
  }

  public Student createStudent(final FDMClass fdmClass, String studentName) {
    Student student = new Student();
    student.setStudentName(studentName);
    student.setStudentRollNumber("12345678");
    student.setCourseDetail(fdmClass);
    return student;
  }

}
