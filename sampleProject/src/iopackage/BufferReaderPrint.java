package iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderPrint {

  public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader(
        "C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects\\src\\iopackage\\inputfile.txt");
    BufferedReader in = new BufferedReader(reader);
    String line = in.readLine();
    while (line != null) {
      System.out.println(line);
      line = in.readLine();
    }
    in.close();
  }

}
