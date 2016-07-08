package accessmodifiers.package1;

public class ProtectedVarTest extends StudentDetail {
  public static void main(String[] args) {
    ProtectedVarTest protectedVarTest = new ProtectedVarTest();
    protectedVarTest.studentAddress = "procted address";
    protectedVarTest.studentName = "protected student name";
    protectedVarTest.setStudentAge(10);

    System.out.println(protectedVarTest.getStudentAge());
    System.out.println(protectedVarTest.studentName);
    System.out.println(protectedVarTest.studentAddress);
  }
}