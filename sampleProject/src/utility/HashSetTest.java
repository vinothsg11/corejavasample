package utility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTest {
  public static void main(String args[]) {
    // HashSet declaration
    HashSet<String> hset = new HashSet<String>();

    // Adding elements to the HashSet
    hset.add("Apple");
    hset.add("Apple");
    hset.add("Mango");
    hset.add("Grapes");
    hset.add("Orange");
    hset.add("Fig");
    // Addition of duplicate elements
    hset.add("Apple");
    hset.add("Mango");
    hset.add(null);
    System.out.println(hset);
    Iterator<String> it = hset.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    treeSetExample();
    linkedHashSetExample();
  }
  static void treeSetExample() {
    TreeSet<Integer> tree = new TreeSet<Integer>();
    tree.add(12);
    tree.add(12);
    tree.add(63);
    tree.add(34);
    tree.add(45);
    Iterator<Integer> iterator = tree.iterator();
    System.out.print("Tree set data: ");
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
  static void linkedHashSetExample() {
    LinkedHashSet<Integer> dset = new LinkedHashSet<Integer>();
    dset.add(new Integer(2));
    dset.add(new Integer(1));
    dset.add(new Integer(1));
    dset.add(new Integer(3));
    dset.add(new Integer(5));
    dset.add(new Integer(4));
    Iterator<Integer> iterator = dset.iterator();
    System.out.println("\nLinked Hash Set");
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}
