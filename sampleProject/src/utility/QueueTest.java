/**
 * 
 */
package utility;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * @author user
 *
 */
public class QueueTest
{
public static void main(String[] args) {

Queue<String> myQueue = new LinkedList<String>(); 

myQueue.offer("First");
myQueue.offer("Second");
boolean flag = myQueue.offer("Third");
System.out.println("Wednesday inserted successfully? "+flag);
try {
	myQueue.add("Fourth");
	myQueue.add("Fifth");
	myQueue.add("Last");
} catch (IllegalStateException e) {
	e.printStackTrace();
}
System.out.println("Pick the head of the queue: " + myQueue.peek());
System.out.println("Print Queue content: " + myQueue);

String head = null;
try {
	head = myQueue.remove();
	System.out.print("1) Push out " + head + " from the queue "); 
	System.out.println("current head is: "+myQueue.element());
} catch (NoSuchElementException e) {
	e.printStackTrace();
}

// remove the head - poll()
head = myQueue.poll();
System.out.print("2) Push out " + head + " from the queue");
System.out.println("and the current head: "+myQueue.peek());

// find out if the queue contains an object
System.out.println("Does the queue contain 'Last'? " + myQueue.contains("Last"));
System.out.println("Does the queue contain 'First'? " + myQueue.contains("First"));
}
}