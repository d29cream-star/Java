
package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.CellPhone;

public class Run {

	public static void main(String[] args) {

		CellPhone cp = new CellPhone();

		// cp.productName = "아이폰 18 Pro";
		// System.out.println(cp.productName);

		// cp.size = 8.0;
		// System.out.println(cp.size);

		cp.setSize(4.0); // size필드의 값 세팅
		// System.out.println("메인 메소드 18행 :" + cp);

		// cp.getSize();
		System.out.println(cp.getSize());

		cp.setProductName("갤럭시폴드");

		cp.setColor("파란색");

		cp.setNetworkProvider("KT");

		System.out.println(cp.getColor());

		String name = cp.getProductName();
		String color = cp.getColor();
		String np = cp.getNetworkProvider();
		double size = cp.getSize();
		
	

		System.out.println(
				"스마트폰 = [제품명: " + name + ", 색상 : " + color + " , 사이즈 : " + size + "인치" + ", 통신사 : " + np + "]");
		
		System.out.println(cp.info());
		
	}

}
