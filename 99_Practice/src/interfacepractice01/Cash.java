package interfacepractice01;

public class Cash implements Payment{

	private int balance = 10000;
	
		@Override
		public int pay(int amount) {
			balance -= (amount * 0.9);
			System.out.println("카드 할인 적용"	);
			return balance;
	}
	
}
