package thread;
class ThreadDemoSync extends Thread {
  private Thread t;
  private String threadName;
  PrintDemo PD;
  ThreadDemoSync(String name, PrintDemo pd) {
    threadName = name;
    PD = pd;
  }
  public void run() {
    synchronized (PD) {
      PD.printCount();
    }
    System.out.println("Thread " + threadName + " exiting.");
  }
  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}
public class MultiThreadSynchronisation {
  public static void main(String args[]) {
    PrintDemo PD = new PrintDemo();
    ThreadDemoSync T1 = new ThreadDemoSync("Thread - 1 ", PD);
    ThreadDemoSync T2 = new ThreadDemoSync("Thread - 2 ", PD);
    T1.start();
    T2.start();
    try {
      T1.join();
      T2.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}

class PrintDemo {
public void printCount() {
  try {
    for (int i = 5; i > 0; i--) {
      System.out.println("Counter   ---   " + i);
    }
  } catch (Exception e) {
    System.out.println("Thread  interrupted.");
  }
}
}
