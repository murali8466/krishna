package org.cap.app;

import java.util.Scanner;

public class Account
{
   
	static int balance = 5000, withdraw, deposit;

	public static void withdraw() {
		if (balance >= withdraw) {
			balance = balance - withdraw;
			System.out.println(balance);
			System.out.println("money succesfully withdrawn");
		} else {
			System.out.println("Insufficient Balance");
		}
		System.out.println("");
	}

	public static void deposit() {
		balance = balance + deposit;
		System.out.println(balance);
		System.out.println("Your Money has been successfully depsited");
		System.out.println("");

	}

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for EXIT");
			System.out.print("Choose the operation you want to perform:");
			int n = s.nextInt();
			switch (n) {
			case 1:
				System.out.print("Enter money to be withdrawn:");
				withdraw = s.nextInt();
				withdraw();
				break;

			case 2:
				System.out.print("Enter money to be deposited:");
				deposit = s.nextInt();
				deposit();
				break;

			case 3:
				System.exit(0);

			}
		}
	}
}
