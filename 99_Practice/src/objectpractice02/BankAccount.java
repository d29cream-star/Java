package objectpractice02;

public class BankAccount {

	private String owner;
	private int balance;
	
	public BankAccount() {
		
	}
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit() {
		System.out.println(owner + "의 통장에 입금합니다.");
		
	}
	
	public void withdraw() {
		System.out.println(owner + "의 통장에서 출금합니다.");
	}
	
}
