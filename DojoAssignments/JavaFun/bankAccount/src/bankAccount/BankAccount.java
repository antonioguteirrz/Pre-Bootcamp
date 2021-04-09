package bankAccount;
import java.util.Random;

class BankAccount {
	protected String accountNumber;
	protected double checkingBalance;
	protected double savingsBalance;
	protected static int numberOfAccounts;
	protected static int totalAmount;
	
	
	BankAccount(){
		accountNumber = accountNumber();
		checkingBalance = 0;
		savingsBalance = 0;
		numberOfAccounts++;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	private String accountNumber() {
		Random r = new Random();
		String bnumber ="";
		for(int i=0;i<10;i++) {
			int number = r.nextInt(9);
			bnumber= bnumber +number;
		}
		return bnumber;
		}
	public void deposit(int value) {
		checkingBalance =checkingBalance +value;
		totalAmount =totalAmount+value;
	}
	public void withdraw(int value) {
		checkingBalance =checkingBalance -value;
		totalAmount =totalAmount-value;
	}
	public void showMoney() {
		System.out.printf("Checking:%s",checkingBalance);
		System.out.printf("Savings:%s",savingsBalance);
	}
		

}
