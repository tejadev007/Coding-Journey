package practice;

public class MainForBankAccountPractice {
	public static void main(String[] args) {
		BankAccount BAP= new BankAccount("20029", 200034);
		
		System.out.println("Account number is "+BAP.getAccountNumber());
		System.out.println("Account Balance is $ "+BAP.getBalance() );
		
		BAP.deposit(20030);
		System.out.println("Account number is "+BAP.getBalance());
		
		BAP.withdraw(2034);
		System.out.println("Account number is "+BAP.getBalance());
	}
}
