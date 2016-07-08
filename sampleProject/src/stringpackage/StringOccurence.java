package stringpackage;

public class StringOccurence {
  static String stringVlaue = " Welcome to java class. This java class will help to"
      + " understand java better";
  static String[] stringArrayInput = stringVlaue.split(" ");

  public static void main(String[] args) {
    String stringInput = (String) args[0];

    int stringlength = stringInput.length();
    int charCount = 0;
    for (int i = 0; i < stringArrayInput.length; i++) {
      if (stringArrayInput[i].equals(stringInput)) {
        charCount++;
      }
    }
    System.out.println("Total charracter count -" + charCount);
  }

}
