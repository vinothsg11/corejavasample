package inheritance;

public class Leopard extends Cat {
  String setN = "test";

  public void growl() {
    System.out.println("Leopard cat");
  }

  // @Override
  // public int hashCode(){
  // return setN.hashCode();
  // }

  @Override
  public boolean equals(Object obj) {
    Leopard leo = (Leopard) obj;
    if (setN == leo.setN) {
      return true;
    } else {
      return false;
    }
  }

}
