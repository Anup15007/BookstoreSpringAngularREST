package com.cg.bookstore.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.bookstore.beans.Admin;
import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.beans.Order;
import com.cg.bookstore.beans.User;
import com.cg.bookstore.daoservices.AdminDAO;
import com.cg.bookstore.daoservices.BookDAO;
import com.cg.bookstore.daoservices.CustomerDAO;
import com.cg.bookstore.daoservices.OrderDAO;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.exceptions.OrderDetailsNotFoundException;

public class BookstoreServicesImpl implements BookstoreServices{

	@Autowired
	BookDAO bookDao;
	@Autowired 
	CustomerDAO customerDao;
	@Autowired 
	OrderDAO orderDao;
	@Autowired 
	AdminDAO adminDao;
	@Override
	public Book acceptBookDetails(Book book) {
		return bookDao.save(book);
	}
	@Override
	public Customer acceptCustomerDetails(Customer customer) {
		return customerDao.save(customer);
	}
	@Override
	public Admin acceptAdminDetails(Admin admin) {
		return adminDao.save(admin);
	}
	@Override
	public List<Book> getAllBookDetails() {
		return bookDao.findAll();
	}
	@Override
	public List<Order> getAllOrderDetails() {
		return orderDao.findAll();
	}
	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerDao.findAll();
	}
	@Override
	public Book getBookDetails(long bookIsbn) throws BookDetailsNotFoundException {
		return bookDao.findById(bookIsbn).orElseThrow(()-> new BookDetailsNotFoundException("Book details not found for "+ bookIsbn));
	}
	@Override
	public Order getOrderDetails(long orderId) throws OrderDetailsNotFoundException {
		return orderDao.findById(orderId).orElseThrow(()-> new BookDetailsNotFoundException("Order details not found for "+ orderId));
	}
	@Override
	public Customer getCustomerDetails(long customerId) throws CustomerDetailsNotFoundException {
		return customerDao.findById(customerId).orElseThrow(()-> new CustomerDetailsNotFoundException("Customer Details not found for "+ customerId));
	}
	@Override
	public boolean removeCustomerDetails(long customerId) throws CustomerDetailsNotFoundException {
		customerDao.deleteById(customerId);
		return true;
	}
	@Override
	public boolean removeBookDetails(long bookId) throws BookDetailsNotFoundException {
		bookDao.deleteById(bookId);
		return true;
	}
}
