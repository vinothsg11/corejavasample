package utility;

import java.util.ArrayList;
import java.util.List;

import onlinestore.Author;

public class PerformanceTest {
  private static final long MEGABYTE = 1024L * 1024L;

  public static long bytesToMegabytes(long bytes) {
    return bytes / MEGABYTE;
  }

  public static void main(String[] args) {
    // I assume you will know how to create a object Person yourself...
    List<Author> list = new ArrayList(1000000);
    for (int i = 0; i <= 1000000; i++) {
      Author auth = new Author();
      auth.setName("Knop");
      list.add(auth);
    }
    // Get the Java runtime
    Runtime runtime = Runtime.getRuntime();

    // Run the garbage collector
    // runtime.gc();
    // Calculate the used memory
    long memory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    runtime.gc();
    System.out.println("after gc");
    memory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
  }
}
