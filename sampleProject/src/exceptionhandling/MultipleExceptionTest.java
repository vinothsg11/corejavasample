package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by user on 6/20/2016.
 */
public class MultipleExceptionTest {
  public static void main(String[] args) {
    try {
      String fileName = "C:\\vinoth\\test.text";
      FileInputStream file = new FileInputStream(fileName);
      int x = (byte) file.read();
    } catch (IOException i) {
      i.printStackTrace();
    } catch (Exception f) // Not valid!
    {
      f.printStackTrace();
    }
  }
}
