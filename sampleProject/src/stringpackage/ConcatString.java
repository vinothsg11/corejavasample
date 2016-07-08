package stringpackage;

public class ConcatString {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    concatWithString();
    System.out.println("Time taken for String-> " + (System.currentTimeMillis() - startTime));
    String str = new String("tes");

    startTime = System.currentTimeMillis();
    concatWithStringBuffer();
    System.out
        .println("Time taken for String Buffer-> " + (System.currentTimeMillis() - startTime));

  }

  static String concatWithString() {
    String t = "Java";
    for (int i = 0; i < 10000; i++) {
      t = t + "TConcat";
    }
    return t;
  }

  public static String concatWithStringBuffer() {
    StringBuffer buff = new StringBuffer();
    for (int i = 0; i < 10000; i++) {
      buff.append("TConcat");
    }
    return buff.toString();
  }
}
