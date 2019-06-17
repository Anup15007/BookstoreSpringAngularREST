package com.cg.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.beans.Order;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.services.BookstoreServices;

@Controller
public class BookstoreServicesController {
	@Autowired
	BookstoreServices bookstoreServices;
	@RequestMapping(value= {"/sayHello"}, method=RequestMethod.GET)
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello World To all From RESTImpl",HttpStatus.OK);
	}
	@RequestMapping(value= {"/getBookDetails"}, method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept = application/json")
	public ResponseEntity<Book> getBookDetailsRequestParam(@RequestParam long bookIsbn) throws BookDetailsNotFoundException{
		Book book = bookstoreServices.getBookDetails(bookIsbn);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	@RequestMapping(value= {"/getCustomerDetails"}, method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept = application/json")
	public ResponseEntity<Customer> getCustomerDetailsRequestParam(@RequestParam long customerId) throws CustomerDetailsNotFoundException{
		Customer customer = bookstoreServices.getCustomerDetails(customerId);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	@RequestMapping(value= {"/getOrderDetails"}, method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept = application/json")
	public ResponseEntity<Order> getOrderDetailsRequestParam(@RequestParam long orderId) throws CustomerDetailsNotFoundException{
		Order order = bookstoreServices.getOrderDetails(orderId);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
	}
	
}
