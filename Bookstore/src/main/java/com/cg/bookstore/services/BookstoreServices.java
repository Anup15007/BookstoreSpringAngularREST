package com.cg.bookstore.services;

import java.util.List;
import com.cg.bookstore.beans.Admin;
import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.beans.Order;
import com.cg.bookstore.beans.User;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.exceptions.OrderDetailsNotFoundException;

public interface BookstoreServices {
	Book acceptBookDetails(Book book);
	Customer acceptCustomerDetails(Customer customer);
	Admin acceptAdminDetails(Admin admin);
	List<Book> getAllBookDetails();
	List<Order> getAllOrderDetails();
	List<Customer> getAllCustomerDetails();
	Book getBookDetails(long bookIsbn) throws BookDetailsNotFoundException;
	Order getOrderDetails(long orderId) throws OrderDetailsNotFoundException;
	Customer getCustomerDetails(long customerId) throws CustomerDetailsNotFoundException;
	boolean removeCustomerDetails(long customerId) throws CustomerDetailsNotFoundException;
	boolean removeBookDetails(long bookIsbn) throws BookDetailsNotFoundException;
}
