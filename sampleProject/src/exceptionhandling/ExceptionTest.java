package exceptionhandling;

//
public class ExceptionTest {
  public static void main(String args[]) {
    try {
      int a[] = new int[2];
      a[0] = 100;
      // System.out.println("Access element three :" + a[10]);
      System.out.println(100 / 0);
    } catch (NullPointerException e) {
      // e.printStackTrace();
      System.out.println("Exception thrown  :" + e.getMessage());
    } catch (ArithmeticException e) {
      // e.printStackTrace();
      System.out.println("RuntimeException thrown  :" + e.getMessage());
    } catch (RuntimeException e) {
      // e.printStackTrace();
      System.out.println("RuntimeException thrown  :" + e.getMessage());
    }
    System.out.println("Out of the block");
  }
}
