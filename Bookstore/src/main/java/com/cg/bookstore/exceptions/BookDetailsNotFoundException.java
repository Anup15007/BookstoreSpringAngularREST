package com.cg.bookstore.exceptions;

public class BookDetailsNotFoundException extends RuntimeException{

	public BookDetailsNotFoundException() {
		super();
	}
	public BookDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public BookDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public BookDetailsNotFoundException(String message) {
		super(message);
	}
	public BookDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}
