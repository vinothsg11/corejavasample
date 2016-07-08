package test;

/**
 * Created by user on 6/17/2016.
 */
public class EqualAndEqualsTest {

  public static void main(String[] args) {
    String firstString = new String("Test");
    String secondString = new String("Test");
    System.out.println(firstString == secondString);
    System.out.println(firstString == firstString);
    System.out.println(firstString.equals(secondString));
  }
}
