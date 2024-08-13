package practice;

public class BankAccountPractice {
	private String accountNumber;
	private double balance;
	
	public BankAccountPractice(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
}
