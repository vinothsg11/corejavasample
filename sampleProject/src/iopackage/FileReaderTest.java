package iopackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 6/20/2016.
 */
// Create File author.txt with the format
// id | name |
// 1 | Daniel |
// 2 | Jeremy |
// 3 | Saifu |
public class FileReaderTest {
  public static void main(String args[]) throws IOException {
    FileReader fileReader = null;
    FileWriter fileWriter = null;

    try {
      fileReader = new FileReader(
          "C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects\\src\\iopackage\\inputfile.txt");
      fileWriter = new FileWriter(
          "C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects\\src\\iopackage\\output.txt");

      int c;
      while ((c = fileReader.read()) != -1) {
        System.out.print((char) c);
        fileWriter.write(c);
      }
    } finally {
      if (fileReader != null) {
        fileReader.close();
      }
      if (fileWriter != null) {
        fileWriter.close();
      }
    }
  }
}