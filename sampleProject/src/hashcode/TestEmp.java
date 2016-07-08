package hashcode;

/**
 * Created by user on 6/17/2016.
 */
public class TestEmp {
  public static void main(String[] args) {
    Emp emp1 = new Emp(23);
    System.out.println("emp1.hashCode()--->>>" + emp1.hashCode());
    ActualHashCodeClass actualHashCodeClass = new ActualHashCodeClass(40);
    // Prints the address of the object instance
    System.out.println("actualHashCodeClass.hashCode()--->>>" + actualHashCodeClass.hashCode());

  }
}
