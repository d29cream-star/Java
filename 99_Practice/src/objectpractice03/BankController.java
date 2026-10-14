package objectpractice03;

public class BankController {

	private BankService bs = new BankService();
	
	public void craft(String name, int balance, String pinNum) {
						
			BankAccount ba = new BankAccount(name, balance, pinNum);
			bs.craft(ba);
		}	
	public BankAccount deposit() {
		return bs.deposit();
	
	}
	public BankAccount withdraw() {
		return bs.withdraw();
	}
}