package com.cg.bookstore.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bookstore.beans.Admin;
import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Category;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.beans.OrderItem;
import com.cg.bookstore.daoservices.AdminDAO;
import com.cg.bookstore.daoservices.BookDAO;
import com.cg.bookstore.daoservices.CategoryDAO;
import com.cg.bookstore.daoservices.CustomerDAO;
import com.cg.bookstore.daoservices.OrderDAO;
import com.cg.bookstore.exceptions.AdminDetailsNotFoundException;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.exceptions.InvalidUserDetailsException;
import com.cg.bookstore.exceptions.OrderDetailsNotFoundException;

@Component("bookstoreServices")
public class BookstoreServicesImpl implements BookstoreServices{
	@Autowired
	BookDAO bookDao;
	@Autowired 
	CustomerDAO customerDao;
	@Autowired 
	OrderDAO orderDao;
	@Autowired 
	AdminDAO adminDao;
	@Autowired 
	CategoryDAO categoryDao;
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
	public List<OrderItem> getAllOrderDetails() {
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
	public OrderItem getOrderDetails(long orderId) throws OrderDetailsNotFoundException {
		return orderDao.findById(orderId).orElseThrow(()-> new BookDetailsNotFoundException("Order details not found for "+ orderId));
	}
	@Override
	public Admin getAdminDetails(String adminEmailId) throws AdminDetailsNotFoundException {
		return adminDao.findById(adminEmailId).orElseThrow(()->new AdminDetailsNotFoundException("Admin Details not found for "+ adminEmailId));
	}
	@Override
	public Customer getCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException {
		return customerDao.findById(customerEmailId).orElseThrow(()-> new CustomerDetailsNotFoundException("Customer Details not found for "+ customerEmailId));
	}
	@Override
	public boolean removeCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException {
		customerDao.deleteById(customerEmailId);
		return true;
	}
	@Override
	public boolean removeBookDetails(long bookIsbn) throws BookDetailsNotFoundException {
		bookDao.deleteById(bookIsbn );
		return true;
	}
	@Override
	public Category addCategory(Category category) {
		return categoryDao.save(category);
	}
	@Override
	public Customer customerLogin(String customerEmailId, String password)
			throws InvalidUserDetailsException, CustomerDetailsNotFoundException {
		Customer customer = getCustomerDetails(customerEmailId);
		if(!password.equals(customer.getPassword())) 
			throw new InvalidUserDetailsException("Invalid Credentials. Please Check.");
		return customer;
	}
	@Override
	public Admin adminLogin(String adminEmailId, String password)
			throws InvalidUserDetailsException, AdminDetailsNotFoundException {
		Admin admin = getAdminDetails(adminEmailId);
		if(!password.equals(admin.getPassword())) 
			throw new InvalidUserDetailsException("Invalid Credentials. Please Check.");
		return admin;
	}
	@Override
	public Customer editProfile(String customerEmailId, String Password)
			throws CustomerDetailsNotFoundException, InvalidUserDetailsException {
		Customer customer = getCustomerDetails(customerEmailId);
		return customerDao.save(customer);
	}
}
