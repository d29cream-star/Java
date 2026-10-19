
package com.kh.chap01.abstraction.run;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Box;

public class Craft {

	public static void main(String[] args) {

		Box b = new Box();
		Scanner sc = new Scanner(System.in);

		System.out.println("크래프트 시작");
		System.out.print("상자 재질 선택 : ");
		b.texture = null;
		try{
			b.texture = sc.nextLine();
		}catch(InputMismatchException e) {
			
		}

		while (true) {
			System.out.println();
			System.out.println(b.texture + "상자를 선택하셨습니다.");
			System.out.println("현재 위치는 " + b.x + "," + b.y +","+ b.z +"입니다.");

			System.out.print("번호를 선택하세요. ");
			System.out.print("1: 쌓기 2: 제거하기 3: 오른쪽 이동하기 4: 왼쪽 이동하기 5: 위쪽 이동하기 6: 아래쪽 이동하기 7: 프로그램 종료 ");
			int height = 0;
			try{
				height = sc.nextInt();
			}catch(InputMismatchException e) {
			}finally {
				sc.nextLine();
			}

			switch (height) {
			case 1:
				b.pileup();
				break;
			case 2:
				b.remove();
				break;
			case 3:
				b.moveright();
				break;
			case 4:
				b.moveleft();
				break;
			case 5:
				b.moveup();
				break;
			case 6:
				b.movedown();
				break;
			case 7:
				sc.close();return;

			}

		}
	}

}
