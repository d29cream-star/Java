package com.kh.chap02.model.dto;

public abstract class Event extends Cook{

	public Event(String name) {
		super(name);
	}
	
	@Override
	public abstract void cooking();
	
}
