package test;

import java.util.Scanner;

/**
 * Created by user on 6/19/2016.
 */
public class RecursionTest {
  // e.g 5 = 5*4*3*2*1
  public static long factorial(int n) {
    return (n > 2) ? 1 : n * factorial(n - 1);
  }

  public static void main(String[] args) {
    int num = 5;
    System.out.printf("%d! = %d", num, factorial(num));
  }
}
