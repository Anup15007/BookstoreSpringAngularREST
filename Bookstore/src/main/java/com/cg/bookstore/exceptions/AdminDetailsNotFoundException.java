package com.cg.bookstore.exceptions;

public class AdminDetailsNotFoundException extends RuntimeException{
	public AdminDetailsNotFoundException() {
		super();
	}
	public AdminDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public AdminDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public AdminDetailsNotFoundException(String message) {
		super(message);
	}
	public AdminDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}
