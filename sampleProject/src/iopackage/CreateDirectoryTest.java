package iopackage;

import java.io.File;

/**
 * Created by user on 6/20/2016.
 */
public class CreateDirectoryTest {
  public static void main(String args[]) {
    String dirname = "testDirectory";
    File d = new File(dirname);
    // Create directory now.
    d.mkdirs();
  }
}
