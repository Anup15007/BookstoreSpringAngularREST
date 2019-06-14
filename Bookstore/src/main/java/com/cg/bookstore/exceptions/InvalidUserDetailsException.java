package com.cg.bookstore.exceptions;

public class InvalidUserDetailsException extends RuntimeException{

	public InvalidUserDetailsException() {
		super();
	}
	public InvalidUserDetailsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidUserDetailsException(String message, Throwable cause) {
		super(message, cause);
	}
	public InvalidUserDetailsException(String message) {
		super(message);
	}
	public InvalidUserDetailsException(Throwable cause) {
		super(cause);
	}
}
