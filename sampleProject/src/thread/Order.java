/**
 * 
 */
package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author user
 *
 */
public class Order
{
private String orderStatus;
private String orderNumber;

Order(){

}
Order(String orderStatus, String orderNumber){
this.orderNumber = orderNumber;
this.orderStatus = orderStatus;
}
public String getOrderStatus() {
return orderStatus;
}

public void setOrderStatus(String orderStatus) {
this.orderStatus = orderStatus;
}

public String getOrderNumber() {
return orderNumber;
}

public void setOrderNumber(String orderNumber) {
this.orderNumber = orderNumber;
}


public static List<Order> loadOrderData(){
List<Order> orderList = new ArrayList();
orderList.add(new Order("INITIAL", "ORD0001"));
orderList.add(new Order("READY", "ORD0098"));
return orderList;
}
}
