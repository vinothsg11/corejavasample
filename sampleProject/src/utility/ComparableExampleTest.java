package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 6/21/2016.
 */
class ComparableSortingTest
    implements Comparator<ComparableSortingTest>, Comparable<ComparableSortingTest> {
  private String name;
  private int age;
  ComparableSortingTest() {
  }
  ComparableSortingTest(String n, int a) {
    name = n;
    age = a;
  }
  public String getComparableSortingTestName() {
    return name;
  }
  public int getComparableSortingTestValue() {
    return age;
  }
  // Overriding the compareTo method
  public int compareTo(ComparableSortingTest d) {
    return (this.name).compareTo(d.name);
  }
  // Overriding the compare method to sort the age
  public int compare(ComparableSortingTest d, ComparableSortingTest d1) {
    return d.age - d1.age;
  }
}


public class ComparableExampleTest {
  public static void main(String args[]) {
    // Takes a list o ComparableSortingTest objects
    List<ComparableSortingTest> list = new ArrayList<ComparableSortingTest>();
    list.add(new ComparableSortingTest("Xyz", 3));
    list.add(new ComparableSortingTest("Boxer", 2));
    list.add(new ComparableSortingTest("Yummy", 10));
    list.add(new ComparableSortingTest("Annie", 4));
    list.add(new ComparableSortingTest("Rannie", 1));
    Collections.sort(list);// Sorts the array list
    System.out.println("Printing Sorted Value");
    for (ComparableSortingTest a : list)
      System.out.print(a.getComparableSortingTestName() + ", ");

    // Sorts the array list using comparator
    Collections.sort(list, new ComparableSortingTest());
    System.out.println(" ");
    for (ComparableSortingTest a : list)// printing the sorted list of ages
      System.out.print(
          a.getComparableSortingTestName() + "  : " + a.getComparableSortingTestValue() + ", ");
  }
}
