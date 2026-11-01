package com.kh.part.exception;

public class InvalidPaymentException extends RuntimeException{

	public InvalidPaymentException (String message) {
		super(message);
	}
}
