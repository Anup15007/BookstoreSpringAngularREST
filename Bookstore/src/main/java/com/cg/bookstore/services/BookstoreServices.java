package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.beans.Address;
import com.cg.bookstore.beans.Admin;
import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Category;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.beans.OrderItem;
import com.cg.bookstore.exceptions.AdminDetailsNotFoundException;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CategoryDetailsNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.exceptions.InvalidUserDetailsException;
import com.cg.bookstore.exceptions.OrderDetailsNotFoundException;

public interface BookstoreServices {
	Book acceptBookDetails(Book book);
	Customer acceptCustomerDetails(Customer customer);
	Admin acceptAdminDetails(Admin admin);
	Customer customerLogin(String customerEmailId, String password) throws InvalidUserDetailsException, CustomerDetailsNotFoundException;
	Admin adminLogin(String adminEmailId, String password) throws InvalidUserDetailsException, AdminDetailsNotFoundException;
	Customer editProfile(String customerEmailId, Address customerAddress) throws CustomerDetailsNotFoundException, InvalidUserDetailsException;
	Category addCategory(Category category);
	List<Book> getAllBookDetails();
	List<OrderItem> getAllOrderDetails();
	List<Customer> getAllCustomerDetails();
	List<Category> getAllCategoryDetails();
	Book getBookDetails(long bookIsbn) throws BookDetailsNotFoundException;
	OrderItem getOrderDetails(long orderId) throws OrderDetailsNotFoundException;
	Admin getAdminDetails(String adminEmailId) throws AdminDetailsNotFoundException;
	Customer getCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException;
	Category getCategoryDetails(int categoryId) throws CategoryDetailsNotFoundException;
	boolean removeCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException;
	boolean removeBookDetails(long bookIsbn) throws BookDetailsNotFoundException;
}
