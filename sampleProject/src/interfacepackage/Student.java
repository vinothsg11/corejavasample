package interfacepackage;

public class Student implements StudentInterface {
  private String name;
  private String address;

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String getStudentName() {

    return name;
  }

  @Override
  public String getStudentAddress() {
    return address;
  }
}
