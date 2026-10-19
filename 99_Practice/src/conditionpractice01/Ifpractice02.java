package conditionpractice01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ifpractice02 {

	public void manu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("🍜🍜🍜🍜🍜국밥집🍜🍜🍜🍜🍜");
		System.out.println("🍜🍜🍜🍜🍜manu🍜🍜🍜🍜🍜");
		System.out.println("우거지국밥 8,000원");
		System.out.println("돼지국밥 8,500원");
		System.out.print("메뉴를 선택하세요.");
		String manuName1 = null;
		try {
			manuName1 = sc.nextLine();
		} catch (InputMismatchException e) {

		}

		if (manuName1.equals("우거지국밥") || manuName1.equals("돼지국밥")) {
			System.out.print("수량을 입력하세요.");
		}
		if (!(manuName1.equals("우거지국밥") || manuName1.equals("돼지국밥"))) {
			System.out.print("다시 입력해주세요.");
			manuName1 = sc.nextLine();
		}
		int manuCount1 = 0;
		try{
			manuCount1 = sc.nextInt();
		}catch(InputMismatchException e) {
			
		}finally {
			sc.nextLine();
		}
		System.out.println(manuName1 + " " + manuCount1 + " 개를 주문하셨습니다.");

		System.out.print("추가 하실 메뉴가 더 있으신가요?");
		sc.nextLine();
		String manuName2 = null;
		try{
			manuName2 = sc.nextLine();
		}catch(InputMismatchException e) {
			
		}

		if (manuName2.equals("우거지국밥") || manuName2.equals("돼지국밥")) {
			System.out.print("수량을 선택하세요.");
		}
		if (!(manuName2.equals("우거지국밥") || manuName2.equals("돼지국밥"))) {
			System.out.print("다시 선택해주세요.");
		}

		int manuCount2 = 0;
		try{
			manuCount2 = sc.nextInt();
		}catch(InputMismatchException e) {
			
		}finally {
			sc.nextLine();
		}
		System.out.println(manuName2 + " " + manuCount2 + " 개를 주문하셨습니다.");

		int total = 0;

		if (manuName1.equals("우거지국밥")) {
			total += manuCount1 * 8000;
		}
		if (manuName1.equals("돼지국밥")) {
			total += manuCount1 * 8500;
		}
		if (manuName2.equals("우거지국밥")) {
			total += manuCount2 * 8000;
		}
		if (manuName2.equals("돼지국밥")) {
			total += manuCount2 * 8500;
		}
		sc.close();
		System.out.println("총 " + total + "원 입니다.");

	}
}
