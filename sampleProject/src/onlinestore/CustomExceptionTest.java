package onlinestore;

public class CustomExceptionTest {
  public static void main(String[] args) {
    String str[] = new String[] { "First", "Secdon", "Third" };
    StringOperation operation = new StringOperation();
    try {
      operation.getIndexByName(str, "JunkName");
    } catch (OnlineAppStoreException oe) {
      System.out.println(oe.getErrorDescription());
    }

  }
}
