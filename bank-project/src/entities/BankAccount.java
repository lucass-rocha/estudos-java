package entities;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		addAccountBalance(initialDeposit);
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void addAccountBalance(double addAccountBalance) {
		this.accountBalance += addAccountBalance;
	}

	public void removeAccountBalance(double removeAccountBalance) {
		this.accountBalance -= removeAccountBalance + 5;
		// $5,00 é a taxa para realizar um saque
	}

	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $"
				+ String.format("%.2f", accountBalance);
	}

}
