package hashcode;

/**
 * Created by user on 6/17/2016.
 */
public class Emp {
  private int age;
  private int employeeId;

  public Emp(int age) {
    super();
    this.age = age;
  }

  public int hashCode() {
    return employeeId;
  }
}
