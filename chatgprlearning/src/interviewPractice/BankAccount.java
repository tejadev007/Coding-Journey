package interviewPractice;


public class BankAccount {
	private String accountNumber;
	private double balance;
	
	
	public BankAccount(String accountNumber, double initialBalance) {
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
		System.out.println("Deposited amount is $"+amount);
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		System.out.println("Withdrawl amount is $"+amount);
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
}


