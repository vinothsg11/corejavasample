package superkeyword;

public class ApacEmployee extends Employee {
  String annualLeave = "Apac Employee Record";

  void Show() {
    System.out.println(super.annualLeave);
    System.out.println(this.annualLeave);
  }

  public static void main(String[] args) {
    new ApacEmployee().Show();
  }
}