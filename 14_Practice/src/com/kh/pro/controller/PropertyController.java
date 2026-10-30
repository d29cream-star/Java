package com.kh.pro.controller;

import java.util.List;

import com.kh.pro.model.dto.Property;
import com.kh.pro.model.service.PropertyService;

public class PropertyController {

	private PropertyService ps = new PropertyService();
	
	public List<Property> read() {
		return ps.read();
	}
	public void save(String name, int price, String grade, String location) {
		ps.save(new Property(name, price, grade, location));
	}
	public void delete(String name) {
		ps.delete(name);
	}
	public List<Property> findByLocation(String location) {
		return ps.findByLocation(location);
	}
	public void update(String name, int newPrice) {
		ps.update(name, newPrice);
	}
}
