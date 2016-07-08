package InnerClass;

public class LocalInnerClassTest {

  // instance method of the outer class
  void my_Method() {
    final int num = 23;
    // method-local inner class
    class MethodInner_Demo {
      public String print(String className) {
        System.out.println("This is method inner class " + className);
        return className;
      }
    }// end of inner class

    // Accessing the inner class
    MethodInner_Demo inner = new MethodInner_Demo();
    String className = inner.print("Microsoft");
  }

  public static void main(String args[]) {
    LocalInnerClassTest outer = new LocalInnerClassTest();
    outer.my_Method();
  }
}
