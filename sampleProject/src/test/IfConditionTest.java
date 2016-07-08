package test;

public class IfConditionTest {
  static String accountnumber = "12345";
  static int a = 20;

  public static void main(String[] args) {
    if (args == null) {
      System.out.println("argument is null");
    } else {
      String result = "test";
      if (result.equals("new")) {
        System.out.println("pass");
      } else if (result.equals("existing")) {
        System.out.println(accountnumber);
      } else {
        System.out.println("no argument");
      }
    }
    test(25);
    System.out.println(a);

  }

  static void test(int a) {
    a = 10;
  }
}
