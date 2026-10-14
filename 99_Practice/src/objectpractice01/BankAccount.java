package objectpractice01;

public class BankAccount {

	public String bankName;
	public String accountNumber;
	public String accountHolder;
	public boolean checkCard;
	public String pinNumber;
	
	public void deposit() {
		System.out.println("입금하다.");
	}
	public void withdraw() {
		System.out.println("출금하다.");
	}
	public void transfer() {
		System.out.println("송금하다.");
	}
}

