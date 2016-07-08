/**
 * 
 */
package thread;

import java.util.Queue;

/**
 * @author user
 *
 */
public class DispatcherServiceThread extends Thread
{
private final Queue sharedQ;

public DispatcherServiceThread(Queue sharedQ) {
  super("DispatcherServiceThread");
  this.sharedQ = sharedQ;
}

@Override
public void run() {
  while (true) {

    synchronized (sharedQ) {
      // waiting condition - wait until Queue is not empty
      while (sharedQ.size() == 0) {
        try {
          System.out.println("Queue is empty, waiting");
          sharedQ.wait();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      }
      Order orderStatus = (Order) sharedQ.poll();
      System.out.println("consuming : " + orderStatus.getOrderStatus());
      sharedQ.notify();
      // termination condition
      if (orderStatus.getOrderStatus().equalsIgnoreCase("READY")) {
        break;
      }
    }
  }
}
}
