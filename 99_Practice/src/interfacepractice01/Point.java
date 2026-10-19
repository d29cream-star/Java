package interfacepractice01;

public class Point implements Payment{
	
	private int balance = 10000;

		@Override
		public int pay(int amount) {
			balance -= (amount * 0.9);
			System.out.println("포인트 할인 적용");
			return balance;
		}
}
