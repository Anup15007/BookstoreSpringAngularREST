package com.cg.bookstore.exceptions;

public class UserDetailsNotFoundException extends RuntimeException{
	public UserDetailsNotFoundException() {
		super();
	}
	public UserDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public UserDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public UserDetailsNotFoundException(String message) {
		super(message);
	}
	public UserDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}
