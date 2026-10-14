package com.kh.array;

import java.util.Arrays;

public class Array {

	public void method1(){
		
		int[] nums = new int[3];
		
		//System.out.println(nums);
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;
		
		System.out.println(nums[0]);
		System.out.println(nums[2]);
		
		int sum = 0;
		for(int i = 0; i <3; i++) {
			sum += nums[i];
		}
			System.out.println(sum);
		}
	public void method2() {
		int [] nums = new int [3];	
		
		System.out.println(nums[0]);
		
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2);
		System.out.println(nums1.hashCode());
		System.out.println(nums1.length);
		
	}

	public void method3() {
		
		int[] nums = new int[3];
		nums[0]	= 10;
		nums[1] = 15;
		nums[2] = 20;
		System.out.println("dd");
		//nums[3] = 1;
		
		System.out.printf("%d,%d,%d\n", nums[0], nums[1], nums[2]);
		for(int i= 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		
	}
	
	public void method4() {
		
		int [] arr = {100, 200, 300, 400, 500, 600 }; 
	
		System.out.println(Arrays.toString(arr));
	
	}

	public void method5() {
		char[] coffee	= new char[2];
		coffee[0] = '커'	;
		coffee[1] = '피'	;
		System.out.println(Arrays.toString(coffee));
		
		coffee = new char[4];
		coffee[2] = '좋';
		coffee[3] = '아';
		System.out.println(Arrays.toString(coffee));
		
		coffee = null;
		System.out.println(coffee);
		System.out.println(Arrays.toString(coffee));
		
	}
	public void method6() {
		int[] origin = {1, 2, 3,};
		
		System.out.println(Arrays.toString(origin));
		
		int[] copy = origin;
		System.out.println(Arrays.toString(origin));
		
		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
	}
	public void method7() {
		int[] origin = {1, 2, 3};
		int[] copy = new int [6];
		
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin,  0, copy2, 0, 3);
		System.out.println(Arrays.toString(copy2));
		
		int[] copy3	= Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));

		
		
		
	}



}
