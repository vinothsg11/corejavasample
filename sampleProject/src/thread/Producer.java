package thread;

import java.util.Queue;

/**
 * Created by user on 6/20/2016.
 */
public class Producer extends Thread {
  private final Queue sharedQ;

  public Producer(Queue sharedQ) {
    super("Producer");
    this.sharedQ = sharedQ;
  }

  @Override
  public void run() {

    for (int i = 0; i < 6; i++) {

      synchronized (sharedQ) {
        // waiting condition - wait until Queue is not empty
        while (sharedQ.size() >= 1) {
          try {
            System.out.println("Queue is full, waiting");
            sharedQ.wait();
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        }
        System.out.println("producing : " + i);
        sharedQ.add(i);
        sharedQ.notify();
      }
    }
  }
}