package iopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by user on 6/20/2016.
 */
public class CopyFileTest {
  public static void main(String args[]) throws IOException {
    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream(
          "C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects\\src\\iopackage\\inputfile.txt");
      out = new FileOutputStream(
          "C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects\\src\\iopackage\\output.txt");

      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } finally {
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
  }
}
