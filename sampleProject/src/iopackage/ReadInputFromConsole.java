package iopackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputFromConsole {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter String");
    String s = br.readLine();
    System.out.println("Enter Integer:");
    try {
      int i = Integer.parseInt(br.readLine());
      
    } catch (NumberFormatException nfe) {
      System.err.println("Invalid Format!");
    }
  }
}
