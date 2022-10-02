package com.example.exception;

public class ProductNotFoundException extends Exception {

	private String errorCode;

	private String message;
	
	public ProductNotFoundException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	@Override
	public String getMessage() {
		return this.errorCode+":"+super.getMessage();
	}
	
	
}