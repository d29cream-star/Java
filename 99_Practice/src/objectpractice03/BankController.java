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
	public int deposit(int input){
		return bs.deposit(input);
	
	}
	public BankAccount withdraw() {
		return bs.withdraw();
	}
	
	public int withdraw(int output) {
		return bs.withdraw(output);
	}
}