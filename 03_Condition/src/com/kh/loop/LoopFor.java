package com.kh.loop;

import java.util.Scanner;

public class LoopFor {

	public void method0() {
		
		for(
			int i = 0;
			i < 100;
			i++
			) {
			System.out.println(i + 1 + "번 반복");
		}
	
	}
	public void method1() {
		for(int i = 0; i <= 2; i++) {
			System.out.println(i + 1);
			}
	
		for(int i = 0; i< 10; i+=2) {
			System.out.println(i);	
			}
	}
	
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 알고 싶나요?");
		int dan = sc.nextInt();
		
		for(int i= 1; 1<= i && i <= 9; i++) {
			System.out.println(dan +" * " + i + " = " + dan * i);
		}
		
	}
	public void star() {	
		
		//for(int i = 1; && int j = 1; i <= 5; && j <= 5; i++ j++)
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
		}
				System.out.println(" ");
		
		}
	
	}
}
