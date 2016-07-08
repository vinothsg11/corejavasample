package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by user on 6/20/2016.
 */
public class CheckedExceptionDemo {
  public static void main(String args[]) throws FileNotFoundException {
    File file = new File("E://file.txt");
    FileReader fr = new FileReader(file);
  }
}
