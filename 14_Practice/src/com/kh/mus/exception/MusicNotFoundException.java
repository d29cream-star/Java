package com.kh.mus.exception;

public class MusicNotFoundException extends RuntimeException{

	public MusicNotFoundException (String message) {
		super(message);
	}
}
