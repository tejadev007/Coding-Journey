package practice;

public class BankMainPractice {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("123454", 200000);
		
		System.out.println(account.getAccountNumber());
		
		System.out.println(account.getBalance());
		
		account.deposit(100);
		System.out.println(account.getBalance());
		
		account.withdraw(2000);
		System.out.println(account.getBalance());
	}
}
