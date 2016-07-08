package inheritance;

public class Tiger extends Cat implements Carnivore {

  public void attack() {
    System.out.println("attack implementation");
  }

  public void growl(String atr) {
    System.out.println("growl cat");
  }

  public void growl() {
    System.out.println("growl cat");
  }

  public void stealthMode() {

  }

}
