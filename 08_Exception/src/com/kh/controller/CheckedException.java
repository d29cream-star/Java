package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public void readString() {
		System.out.println("나는 체크드 익셉션");
		System.out.println();

		// Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();

		// System.out.println(str.length());
		// if(str.equals("exit")) {}break;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("문자열입력");
			String str = br.readLine();
			System.out.println(str.length());
		} catch (IOException e) {

		}
	}

	public void bang() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();

	}
}
