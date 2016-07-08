package thread;

/**
 * Created by user on 6/20/2016.
 */
public class DisplayMessage extends Thread {
  private String message;

  public DisplayMessage(String message) {
    this.message = message;
  }

  public void run() {
    while (true) {
      try {
        this.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("DisplayMessage -> " + message);
    }
  }

  public static void main(String[] args) {
    new DisplayMessage("Test Message").start();
  }
}
