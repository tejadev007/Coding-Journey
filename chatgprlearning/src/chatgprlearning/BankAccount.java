package chatgprlearning;

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


public class BankAccountPractice {
	 public static void main(String[] args) {
		BankAccount account = new BankAccount("176787",2000);
		
	}
}

