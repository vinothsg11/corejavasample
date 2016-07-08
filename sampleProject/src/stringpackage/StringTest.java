package stringpackage;

public class StringTest {
  public static void main(String[] args) {

    String firstString = "";
    String duplicateString = new String();

    System.out.println("firstString and duplicateString share same location "
        + firstString.equals(duplicateString));

    System.out.println(
        "firstString and duplicateString share same location " + firstString == duplicateString);

    // System.out.println("\"Welcome To Java Class -> " + "\'Here we go\' <- \"");
    // System.out.format("Total Number of Records %d / %d \n", 10,5);
    // System.out.println(String.format("Test value %d", 10));
    // System.out.printf("Total is: $%,.2f%n", 100.43d);
    // System.out.printf("Total: % -10.2f : ", 100.4344d);
    // System.out.printf("%4d", 100);
    // System.out.printf("%20.10s \n", 500);
    // String s = "Hello World";
    // System.out.printf("The String object %s is at hash code %h%n", s, s);
  }
}
