package exceptionhandling;

public class RuntimeExceptionTest {

  public static void main(String args[]) throws Exception {
    int a = 10;
    try {
      a = testRunTime();
    } catch (Exception ee) {
      System.out.println("erro value ->" + a);
      ee.printStackTrace();
    }
    System.out.println("a value ->" + a);
    System.out.println("test");

  }

  static int testRunTime() throws Exception {
    try {
      int i = 2 * 4;
      // throwing Error will result in unchecked exception make the JVM fail
      if (i == 8)
        throw new Exception("System can not proceed further. Sorry");
    } finally {
      return 2;
    }
  }

  static void testRuntimeMethod2() throws Exception {
    // try {
    testRunTime();
    // }catch(Exception e){
    // throw new Exception("Error in the method testRuntimeMethod2 while doing the calculation" +
    // e.getMessage());
    //
    // }

  }
}
