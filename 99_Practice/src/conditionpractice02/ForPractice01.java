package conditionpractice02;

public class ForPractice01 {
	
	public void ForStarMaker() {
		
		for(int i = 1; i <= 5; i++ ) {
			for(int j = 1; j <= 5 - i; j++) { 
				System.out.print(" ");
				}
			for(int j = 1; j <= 2 * i-1; j++) { 
			System.out.print("*");
			}
		System.out.println();
		}
		for(int i = 1; i <= 4; i++) {//
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 7; j >= i * 2 - 1 ;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	
	
	}

}
