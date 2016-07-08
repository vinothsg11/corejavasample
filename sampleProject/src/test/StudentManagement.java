package test;

import beanPackage.CourseDetail;
import beanPackage.FDMClass;
import beanPackage.Student;

public class StudentManagement {

  public static void main(String[] args) {
    // FDMClass fdmClass = createClass();
    CourseDetail courseDetail = new CourseDetail();
    FDMClass oracleClass = courseDetail.createClass("Oracle", "OracleClass");
    FDMClass javaClass = courseDetail.createClass("Java", "Java class");
    FDMClass hibernateClass = courseDetail.createClass("Hibernate", "Hibernate Class");
    FDMClass springClass = courseDetail.createClass("Spring", "Spring Class");

    Student firstStudent = courseDetail.createStudent(oracleClass, "XYZ");

    Student newStudent = (Student) firstStudent.clone();

    Student duplicateStudent = courseDetail.createStudent(oracleClass, "XYZ");
    System.out.println("Student name is same -> " + firstStudent.equals(duplicateStudent));
    Student secondStudent = courseDetail.createStudent(oracleClass, "ABC");
    Student thirdStudent = courseDetail.createStudent(oracleClass, "UXY");

    courseDetail.addStudentToClass(oracleClass, firstStudent, 0);
    courseDetail.addStudentToClass(oracleClass, firstStudent, 1);
    courseDetail.addStudentToClass(oracleClass, firstStudent, 2);

    Student[] studentList = courseDetail.getStudentList(oracleClass);

    courseDetail.printStudentList(studentList);

    // courseDetail.printStudentList(courseDetail.getStudentList(oracleClass));

    System.out.println("Student name is -> " + firstStudent.getStudentName() + " - Class name is ->"
        + firstStudent.getCourseDetail().getCourseName());

  }

}
