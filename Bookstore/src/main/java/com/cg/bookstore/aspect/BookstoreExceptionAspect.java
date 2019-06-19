package com.cg.bookstore.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.response.CustomResponse;

@ControllerAdvice
public class BookstoreExceptionAspect {
	@ExceptionHandler(CustomerDetailsNotFoundException.class)
	public ResponseEntity<CustomResponse> handleAssociateDetailNotFoundException1(Exception e) {
		CustomResponse response = new CustomResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
	}
}