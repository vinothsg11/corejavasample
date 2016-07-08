package utility;

import java.io.IOException;

public class RunNotePadTest {
  public static void main(String[] args) throws IOException {
    Runtime runtime = Runtime.getRuntime();
    Process process = runtime.exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
  }
}
