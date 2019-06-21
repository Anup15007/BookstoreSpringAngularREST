package com.cg.bookstore.exceptions;

public class CategoryDetailsNotFoundException extends RuntimeException{

	public CategoryDetailsNotFoundException() {
		super();
	}
	public CategoryDetailsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public CategoryDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public CategoryDetailsNotFoundException(String message) {
		super(message);
	}
	public CategoryDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}
