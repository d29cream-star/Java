
package com.kh.chap06.controller;

import com.kh.chap06.controller.MethodController;

public class Run {
	
	public static void main(String[] args) {
		
		MethodController m1 = new MethodController();
		/*MethodController m2 = new MethodController();

		int a = m1.add(2, 3);
		int b = m1.add(3, 5);
		System.out.println(a);
		System.out.println(b);

		System.out.println(m2.fn(3));
		System.out.println(m2.fn2());
		
		*/
		m1.method();
		m1.method(1);
		m1.method(1,2);
		m1.method("s");
	
		
	}
	
}