package com.kh.chap01;

public class Run {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.printParent();
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		
		Parent p2 = new Child1();
		p2.printParent();
		//p2.printChild2();
		
		((Child1)p2).printChild1();

		//Parent p3 = new String();
		Parent[] arr = {new Child1(), new Child1(), new Child1(), new Child1()};
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
		}
		
	}
	

}
