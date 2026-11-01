package com.kh.part.controller;

import java.util.List;

import com.kh.part.model.dto.PartTime;
import com.kh.part.model.service.PartTimeService;

public class PartTimeController{

	private PartTimeService ps = new PartTimeService();
	
	public List<PartTime> read() {
		return ps.read();
	}
	public void save(String location, int time, int payment, String date) {
		ps.save(new PartTime(location, time, payment, date));
	}
	public void delete(String name) {
		ps.delete(name);
	}
	public List<PartTime> findByDate(String date) {
		return ps.findByDate(date);
	}
	public void update(String location, int NewTime){
		ps.update(location, NewTime);
	}
	
}
