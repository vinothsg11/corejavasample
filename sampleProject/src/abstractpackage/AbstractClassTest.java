package abstractpackage;

/**
 * Abstract Class example
 */
// When a method is decalared as Abstract class must be declared as abstract
abstract class AbstractClassTest {
  private String teacherName;

  protected abstract int getRetiredAge();

  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }
}
