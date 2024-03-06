package application;

import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount account = null;

		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter account holder: ");
		String accountHolder = sc.nextLine();

		System.out.println("Is there an initial deposit value (y/n)? ");
		String initialDeposit = sc.nextLine();
		if (initialDeposit.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double firstDeposit = sc.nextDouble();
			account = new BankAccount(accountNumber, accountHolder, firstDeposit);
		} else {
			account = new BankAccount(accountNumber, accountHolder);
		}

		System.out.println("Updated data: ");
		System.out.println(account);
		System.out.println();

		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.addAccountBalance(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();

		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.removeAccountBalance(withdrawValue);
		System.out.println("Updated data: ");
		System.out.println(account);

		sc.close();
	}
}
