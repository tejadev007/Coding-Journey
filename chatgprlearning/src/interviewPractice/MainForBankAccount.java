package interviewPractice;

public class MainForBankAccount {
	public static void main(String[] args) {
		BankAccount BA = new BankAccount("12345", 2000.0);
		System.out.println("AccountNumber: "+BA.getAccountNumber());
		System.out.println("Balance: $"+BA.getBalance());
		
		BA.deposit(20000);
		System.out.println("Balance: $"+BA.getBalance());
		
		BA.withdraw(5000);
		System.out.println("Balance: $"+BA.getBalance());
	}
}
