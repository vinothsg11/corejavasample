package thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by user on 6/20/2016.
 */
public class InterThreadCommunicationExample {
  public static void main(String args[]) {

    final Queue sharedQ = new LinkedList<>();

    Thread producer = new Producer(sharedQ);
    Thread consumer = new Consumer(sharedQ);

    producer.start();
    consumer.start();

  }
}
