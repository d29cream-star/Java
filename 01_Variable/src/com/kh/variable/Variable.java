package com.kh.variable;

public class Variable {

	public void printNumber() {
		int number = 8;
		System.out.println(number);
		
		boolean isTrue;
		isTrue = true;
		System.out.println(isTrue);
	
		isTrue = false;
		System.out.println(isTrue);
	
		byte byteNum = 1;
		System.out.println(byteNum);
		
		short shortNum = 2;
		int intNum = 3;
		long longNum = 4L;
		
		System.out.println(shortNum);
		System.out.println(intNum);
		System.out.println(longNum);
		
		float floatNum = 1.12F;
		double dbNum = 1.1;
		
		System.out.println(floatNum);
		System.out.println(dbNum);
		
		
		char gold = '금';
		System.out.println(gold);
		
		String fruit = "사과";
		System.out.println(fruit);
	
		String source = "출력값:";
		System.out.println(source);
		System.out.println(source + gold);
		System.out.println(source + fruit);
		System.out.println(source + shortNum);
		System.out.println(source + intNum);
		System.out.println(source + dbNum);
		
	
		final int START_YEAR = 1998;
		System.out.println(START_YEAR);
		
		
}
}