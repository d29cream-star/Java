package objectpractice03;

public class BankAccount {

	private String name;
	private int balance;
	private String pinNum;

	public BankAccount() {

	}

	public BankAccount(String name, int balance, String pinNum) {
		this.name = name;
		this.balance = balance;
		this.pinNum = pinNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setPinNum(String pinNum) {
		this.pinNum = pinNum;
	}

	public String getPinNum() {
		return pinNum;
	}

}
