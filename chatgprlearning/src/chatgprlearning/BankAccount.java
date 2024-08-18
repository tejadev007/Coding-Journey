package chatgprlearning;

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
	
	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(int amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
}



