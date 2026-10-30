package com.kh.part.model.dto;

public class PartTime {

	private String location;
	private int payment;
	private int time;
	private String date;
	
	public PartTime(String location, int payment, int time, String date) {
		super();
		this.location = location;
		this.payment = payment;
		this.time = time;
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PartTimeService [date=" + date + ", location=" + location + ", payment=" + payment + ", time=" + time
				+ "]";
	}
	
}
