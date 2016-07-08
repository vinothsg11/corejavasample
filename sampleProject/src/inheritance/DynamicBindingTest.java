package inheritance;

public class DynamicBindingTest {
  public static void main(String[] args) {
    Cat cat1 = new Leopard();
    cat1.growl();

    Leopard leopard = new Leopard();

    Leopard leopard1 = new Leopard();
    leopard1.setN = "test";
    System.out.println(leopard.equals(leopard1));

  }
}
