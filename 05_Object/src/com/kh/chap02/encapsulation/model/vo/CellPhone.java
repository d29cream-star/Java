
package com.kh.chap02.encapsulation.model.vo;

public class CellPhone {

	private String productName;
	private String networkProvider;
	private double size;
	private String color;
	
	public CellPhone() {
		
	}
	
	public CellPhone(String productName, String networkProvider, double size, String color) {
		this.productName = productName;
		this.networkProvider = networkProvider;
		this.size = size;
		this.color = color;
	}

	public void setSize(double size) {
		// System.out.println(size);
		System.out.println("setSize 12행:" + this);
		this.size = size;
		// size = size;
	}

	public double getSize() {
		return size;

	}

	public void setProductName(String productName) {
		this.productName = productName;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNetworkProvider(String networkProvider) {
		this.networkProvider = networkProvider;
	}

	public String getProductName() {
		return productName;
	}
	public String getColor() {
		return color;
	}
	public String getNetworkProvider() {
		return networkProvider;
	}
	
	
	
	public String info() {
		String info = "폰 = [제품명: " + productName + ", 색상 : " + color + ", 사이즈: " +size + ", 통신사 : " + networkProvider + "]";
		return info;
	}
	
}
