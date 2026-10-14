package com.kh.operator.controller;

public class OperatorController {

	public void arithetic() {
		
		int firstNum = 3;
		int secondNum= 10;
	
	System.out.println("first: " + firstNum);
	System.out.println("Second:" + secondNum);
	
	System.out.println("first + second : " + firstNum + secondNum);
	System.out.println("first + second : " + (firstNum + secondNum));
	
	int sum = firstNum + secondNum;
	
	System.out.println("first + second : " + sum);
	
	System.out.print("first + second : ");
	System.out.println(firstNum + secondNum);

	System.out.printf("first + second : %d%n", firstNum + secondNum);
	System.out.println();
		
	System.out.println("first - second : " + (firstNum - secondNum));
	System.out.println("first X second : " + (firstNum * secondNum));
	System.out.println("first / second : " + (firstNum / secondNum));
	System.out.println("first mod second : " + (firstNum % secondNum));
	
}	
	public void increase() {
		int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(num);
	
		int a = 10; //11
		int b = a++; //10
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		int d = ++c;
		System.out.println(c);//11
		System.out.println(d);//11
		
	}
	
	public void compound() {
		long veryBigNumberCount = 1000L;
		veryBigNumberCount = veryBigNumberCount +1658;
		
		veryBigNumberCount += 1;
		
		System.out.println(veryBigNumberCount);
		
	}
	
	public void logicalNagation() {
		System.out.println(true);
		System.out.println(!true);
	
	}
	
	public void comparison() {
		System.out.println(1 == 2);
		System.out.println(1 > 2);
		
		int firstNum = 10;
		int secondNum = 25;
		
		System.out.println(firstNum < secondNum);
		System.out.println(firstNum > secondNum);
		System.out.println(firstNum == secondNum);
		System.out.println(firstNum != secondNum);
		
		System.out.println("firstNum가 짝수입니까?");
		System.out.println((firstNum % 2 )== 0);
		
	}
	public void logical() {
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
	}
	public void triple() {
		
		
	}
	
	
	
}
