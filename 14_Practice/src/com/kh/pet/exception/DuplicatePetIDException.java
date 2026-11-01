package com.kh.pet.exception;

public class DuplicatePetIDException extends RuntimeException{

	public DuplicatePetIDException (String message) {
		super(message);
	}
}
