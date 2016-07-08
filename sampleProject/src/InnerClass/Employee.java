package InnerClass;

/**
 * Static Inner Class Example
 */
public class Employee {

  static class GlobalEmployee {
    int retirementAge = 50;

    public int getRetirementAge() {
      return retirementAge;
    }
  }

  public static void main(String[] args) {
    // Get global employee retirement age
    Employee.GlobalEmployee globalEmployee = new Employee.GlobalEmployee();
    System.out.println(globalEmployee.getRetirementAge());
  }
}
