package ui;
import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		
		//welcome
		System.out.println("Welcome to the Account Balance Calculator");

		CheckingAccount ca = new CheckingAccount(1000, 1);
		SavingsAccount  sa = new SavingsAccount(1000, .01);
		
		System.out.println("\nStarting Balances");
		summarizeAccountBalances(ca, sa);
		System.out.println("\nEnter the transactions for the month\n");
		
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			//get user input
			String transType = Console.getString("Withdrawal or Deposit? (w/d): ", "w", "d");
			String accountType = Console.getString("Checking or Savings?   (c/s): ", "c", "s");
			double amount = Console.getDouble("Ammount?: ", 0, Double.POSITIVE_INFINITY);
			
			//business logic
			Account a;
			if (accountType.equals("c")) {
				a = ca;
			}
			else {
				a = sa;
			}
			
			if (transType.equals("w")) {
				a.withdraw(amount);
			}
			else {
				a.deposit(amount);
			}
						
			choice = Console.getString("\nContinue? (y/n): ");		
		}
		
		//print results
		sa.applyPayment();
		ca.subtractMonthlyFee();
		
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking Fee: " + ca.getMonthlyFee());
		System.out.println("Savings Interest Payment: " + sa.getMonthlyInterestPayment());
		
		System.out.println("Final Balances");
		summarizeAccountBalances(ca, sa);
		
		//goodbye

	}
	
	private static void summarizeAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		NumberFormat cf = NumberFormat.getCurrencyInstance(); 
		System.out.println("Checking: " + cf.format(ca.getBalance()) +
				 			"\nSavings:  " + cf.format(sa.getBalance()));
	}

}
