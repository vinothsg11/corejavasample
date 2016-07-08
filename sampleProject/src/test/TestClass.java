package test;

/**
 * Pass by value. Copy of the variable is being passed. In this case changing the variable value in
 * someother method will not impact the original value.
 * 
 * @author user
 *
 */
public class TestClass {
  public static void main(String[] args) {
    String classTest = "Test";
    // TODO Auto-generated method stub
    int changeValue = 50;
    // System.out.println("Before changing -> "+ changeValue);
    // changeInteger(changeValue);
    // System.out.println("After changing -> "+ changeValue);
    // System.out.println("Vlaue of " + changeValue + ".");

    String formattedOutput = String.format("Value of %d, %d", changeValue, changeValue);
    System.out.print(formattedOutput);
  }

  /**
   * Change the value of the integer argument value.
   * 
   * @param changeValue
   */
  static void changeInteger(int changeValue) {
    changeValue = 100;
  }
}
