package accessmodifiers.package1;

//Visible to the package. the default. No modifiers are needed.
//Visible to the class only (private).
//Visible to the world (public).
//Visible to the package and all subclasses (protected).
public class StudentDetail {

  private int studentAge;

  protected String studentName;

  public String studentAddress;

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getStudentAddress() {
    return studentAddress;
  }

  public void setStudentAddress(String studentAddress) {
    this.studentAddress = studentAddress;
  }

  public int getStudentAge() {
    return studentAge;
  }

  public void setStudentAge(int studentAge) {
    this.studentAge = studentAge;
  }
}
