package stringpackage;

//String and Stringbuffer
//String buffer - reserve of 16 bytes and memory allocation will be double the size. Thread safe.
//String Builder
public class StringStringBuffer {

  String studentName = "Test Student";

  public static void main(String[] args) {
    // String buffer
    StringBuffer studentAddress = new StringBuffer("Test");
    StringBuffer studentString = new StringBuffer(10);
    studentString.append("testString");
    studentString.reverse();

    System.out.println("String length " + studentAddress.length()
        + " - String buffer capacity 1 -> " + studentAddress.capacity());
    StringBuffer studentAddress1 = new StringBuffer("Test Builder");
    System.out.println("String length " + studentAddress1.length()
        + " - String buffer capacity 2 -> " + studentAddress1.capacity());
    studentAddress1.append("-1234567891011121");
    System.out.println("After append buffer length " + studentAddress1.length()
        + " - String buffer capacity 2 -> " + studentAddress1.capacity());

    // String builder
    StringBuilder stringBuilder = new StringBuilder("Test");

    System.out.println("String length " + stringBuilder.length()
        + " - String builder capacity 1 -> " + stringBuilder.capacity());
    StringBuilder stringBuilder1 = new StringBuilder("Test Builder");
    System.out.println("String length " + stringBuilder1.length()
        + " - String builder capacity 2 -> " + stringBuilder1.capacity());
    stringBuilder1.append("-1234567891011121");
    System.out.println("After append  builder length " + stringBuilder1.length()
        + " - String builder capacity 2 -> " + stringBuilder1.capacity());

    System.out.println("Reverse of String " + stringBuilder1.reverse());

  }
}
