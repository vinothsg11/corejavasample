package stringpackage;

import java.util.StringTokenizer;

//Default String tokenizer is split by space
public class StringTokenizerTest {

  public static void main(String[] args) {
    StringTokenizer stringTokenizer = new StringTokenizer("1234/45 54");
    System.out.println(stringTokenizer.countTokens());
    while (stringTokenizer.hasMoreTokens()) {
      System.out.println(stringTokenizer.nextElement());
    }
    StringTokenizer studentName = new StringTokenizer("TestName,TestName2", ",");
    System.out.println(studentName.countTokens());
    while (studentName.hasMoreTokens()) {
      System.out.println(studentName.nextElement());
    }
  }
}
