package com.kh.variable;

public class Casting {

	public void autoCasting() {
		
		int intNum = 10;
		System.out.println(intNum);
		
		double doubleNum = intNum;
		System.out.println(doubleNum);
		System.out.println(intNum);
		
		intNum = (int)doubleNum;
		
		long lNumber = (long)4;

		long longNumber = 1000L;
		float floatNumber = longNumber;
		System.out.println(floatNumber);
		
		char ch = 'a';
		System.out.println(ch);
		int num = ch;
		System.out.println(num);
		
		char character = 97;
		System.out.println(character);
	
		int a = 'ㅏ';
		System.out.println(a);
		
		//byte b = 128;
		System.out.println((char)('a' + 3));
		System.out.println("a"+"b");
		
		
		
	
		
	}
}
