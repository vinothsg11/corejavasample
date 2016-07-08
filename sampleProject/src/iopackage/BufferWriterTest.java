package iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest {
  public static void main(String[] args) throws IOException {
    String fileContent = "Ttest for Buffer Writer1";
    FileWriter fileWriter = new FileWriter("C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\"
        + "SampleProjects\\src\\iopackage\\bufferWriter.txt");
    BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
    bufferWriter.write(fileContent);
    bufferWriter.close();

    System.out.println("Reading the file content");
    BufferedReader in = new BufferedReader(new FileReader(
        "C:\\vinoth\\vinothproject\\Atom\\Atom - 2016-06-16\\SampleProjects\\src\\iopackage\\bufferWriter.txt"));
    String line = in.readLine();
    while (line != null) {
      System.out.println(line);
      line = in.readLine();
    }
    in.close();
  }
}