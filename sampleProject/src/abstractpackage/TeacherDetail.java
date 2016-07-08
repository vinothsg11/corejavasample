package abstractpackage;

/**
 * Abstract Class Example.
 */
public class TeacherDetail extends AbstractClassTest {

  @Override
  protected int getRetiredAge() {
    return 0;
  }

  public static void main(String[] args) {
    TeacherDetail teacherDetail = new TeacherDetail();
    teacherDetail.setTeacherName("Teacher Name");
    System.out.println(teacherDetail.getRetiredAge());
    System.out.println(teacherDetail.getTeacherName());

  }
}