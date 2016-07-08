package thread;

/**
 * Created by user on 6/20/2016.
 */


class ThreadDemo extends Thread {
  private Thread t;
  private String threadName;
  PrintDemo PD;

  ThreadDemo(String name, PrintDemo pd) {
    threadName = name;
    PD = pd;
  }

  public void run() {
    PD.printCount();
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

public class MultiThreadNoSynchronisation {
  public static void main(String args[]) {

    PrintDemo PD = new PrintDemo();

    ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
    ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);

    T1.start();
    T2.start();

    // wait for threads to end
    try {
      T1.join();
      T2.join();
    } catch (Exception e) {
      System.out.println("Interrupted");
    }
  }
}
