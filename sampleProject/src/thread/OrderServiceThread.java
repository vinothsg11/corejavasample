/**
 * 
 */
package thread;

import java.util.List;
import java.util.Queue;

/**
 * @author user
 *
 */
public class OrderServiceThread extends Thread
{
private final Queue sharedQ;
private List<Order> orderList;
public OrderServiceThread(Queue sharedQ, List<Order> orderList) {
  super("OrderServiceThread");
  this.sharedQ = sharedQ;
  this.orderList =  orderList;
}

@Override
public void run() {
int orderSize = orderList.size();
  for (Order order : orderList) {

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
      System.out.println("producing : " + order.getOrderNumber());
      sharedQ.add(order);
      sharedQ.notify();
    }
  }
}
}
