package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {

		Integer i = new Integer(10);
	
		Integer i1 =15;
		Double d = 2.2;
	
		String str1 = "11";
		String str2 = "1.1";
		System.out.println(i1 + str1);
		
		int num = Integer.parseInt(str1);
		System.out.println(num);
		
		double d1= Double.parseDouble(str2);
		System.out.println(num+d1);
		
		//String str = d1 + "";
		String str = String.valueOf(d1);
		
		
	}

}
