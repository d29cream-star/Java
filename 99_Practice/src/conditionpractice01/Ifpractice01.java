package conditionpractice01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ifpractice01 {

	public void quiz() {
		Scanner sc = new Scanner(System.in);		
		int count = 0;
		int wrongCount = 0;
		
		System.out.println("OX 퀴즈 맞히기");
		System.out.print("1번 대한민국의 수도는 부산이다");
		char answer = ' ';
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {
			
		}
		String result = (answer == 'x')||(answer == 'X') ? "정답입니다.":"오답입니다.";
		System.out.println(result);
		if (answer == 'x' || answer == 'X') {count++;}else {wrongCount++;}
		
		System.out.print("2번 지구는 태양 주위를 돈다");
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {
			
		}
		if(answer == 'o' || answer == 'O') {System.out.println("정답입니다.");count++;
		}
		if(answer == 'x' || answer == 'X') {System.out.println("오답입니다.");wrongCount++;
		}
		if(answer != 'o' && answer !='O' && answer != 'x' && answer != 'X') {System.out.println("재입력하세요.");	
		wrongCount++;}
		
		System.out.print("3번 물은 섭씨 100도에서 끓는다.");
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {
			
		}
		if(answer == 'o' || answer == 'O') {System.out.println("정답입니다.");count++;
		}
		if(answer == 'x' || answer == 'X') {System.out.println("오답입니다.");wrongCount++;
		}
		if(!(answer == 'o' || answer == 'O' || answer == 'x' || answer == 'X')) {System.out.println("재입력하세요.");
		wrongCount++;}
		
		System.out.print("4번 사람의 손가락은 한 손에 6개다.");
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {
			
		}
		if(answer == 'X' || answer == 'x'){System.out.println("정답입니다.");count++;
		}else {System.out.println("오답입니다.");wrongCount++;
		}
		
		System.out.print("5번 기린은 서서 잠을 잔다.");
		try{
			answer = sc.nextLine().charAt(0);
		}catch(InputMismatchException e) {
			
		}
		if(answer == 'o' || answer == 'O'){System.out.println("정답입니다.");count++;
		}else {System.out.println("오답입니다.");wrongCount++;
			}
		sc.close();
		System.out.println("최종 백점만점에");
		System.out.println((count * 20) + "점 입니다. 수고하셨습니다.");
	}
}
