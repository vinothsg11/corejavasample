package InnerClass;

/**
 * Inner class Example
 */
public class Salary {
  class ApacSalary {
    String directorSalary = "150000";

    public String getDirectorSalary() {
      return directorSalary;
    }

    public void setDirectorSalary(String directorSalary) {
      this.directorSalary = directorSalary;
    }
  }

  class SingaporeSalary {
    String directorSalary = "145000";
  }

  String getApacSalary() {
    return new ApacSalary().directorSalary;
  }

  String getSingaporeSalary() {
    return new SingaporeSalary().directorSalary;
  }

  public static void main(String[] args) {
    Salary salary = new Salary();
    ApacSalary apacSalary = salary.new ApacSalary();
    apacSalary.setDirectorSalary("90000");
    System.out.println("apacSalary ->" + apacSalary.getDirectorSalary());
    System.out.println(salary.getApacSalary());
    System.out.println(salary.getSingaporeSalary());

  }
}
