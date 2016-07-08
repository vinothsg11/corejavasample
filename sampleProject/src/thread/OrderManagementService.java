/**
 * 
 */
package thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author user
 *
 */
public class OrderManagementService
{
public static void main(String args[]) {

final Queue sharedQ = new LinkedList<>();

Thread orderSerice = new OrderServiceThread(sharedQ, Order.loadOrderData());
Thread dispatcherService = new DispatcherServiceThread(sharedQ);

orderSerice.start();
dispatcherService.start();

}
}
