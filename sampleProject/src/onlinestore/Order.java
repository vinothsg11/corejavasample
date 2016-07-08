package onlinestore;

import java.sql.Date;

public class Order {
  int orderId;
  int customerId;
  Date transactionDate;
  Book[] purchasedBooks;
  Payment paymentInfo;
}
