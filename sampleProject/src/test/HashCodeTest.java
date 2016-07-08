package test;

class hashCode1 {
  String name = "test";

  public int hashCode() {
    return 100;
  }
}

class hashCode2 {
  String age;

  public int hashCode() {
    return 100;
  }
}

public class HashCodeTest {
  public static void main(String args[]) {
    hashCode1 code1 = new hashCode1();
    hashCode2 code2 = new hashCode2();
    System.out.println(code1.equals(code2));
  }
}
