package iopackage;

import java.io.File;

/**
 * Created by user on 6/20/2016.
 */
public class ReadDirTest {
  public static void main(String[] args) {

    File file = null;
    String[] paths;

    try {
      // create new file object
      file = new File("C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects");

      // array of files and directory
      paths = file.list();

      // for each name in the path array
      for (String path : paths) {
        // prints filename and directory name
        System.out.println(path);
      }
    } catch (Exception e) {
      // if any error occurs
      e.printStackTrace();
    }
  }
}
