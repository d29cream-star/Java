package objectpractice03;

public class BankService {

	private BankAccount ba;
	
	public void craft(BankAccount ba) {
		this.ba = ba;
		
	}
	public BankAccount deposit() {
		return ba;
	}
	
	public int deposit(int input) {
		if (input >= 0) {
			ba.setBalance(ba.getBalance() + input);
		} else {
		
		}
		return ba.getBalance();
		
	}
	public BankAccount withdraw() {
		return ba;

	}
	
	public int withdraw(int output) {
		if (output <= ba.getBalance() && output > 0) {
			ba.setBalance(ba.getBalance() - output);
		} else if (output < 0) {
		} else {

	}return ba.getBalance();
	}
}

