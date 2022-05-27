package bank.com;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		int r = 1;
		Scanner input = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();
		while(r != 0) {
			System.out.println("\n" + "MENU");
			System.out.println("0 Stop");
			System.out.println("1 Create account");
			System.out.println("2 Close account");
			System.out.println("3 Take money");
			System.out.println("4 Return all");
			System.out.println("5 Pay monthly");
			System.out.println("6 Deposit");
			System.out.println("\nType an number: ");
			
			int choose1 = input.nextInt();
			
			if(choose1 == 0) {
				r = r - r;
			}
			if(choose1 == 1){
				bankAccount.createAccount();
			}
			if(choose1 == 2) {
				bankAccount.closeAccount();;
			}
			if(choose1 == 3) {
				System.out.println("Take money: ");
				int value = input.nextInt();
				bankAccount.takeMoney(value);
			}
			if(choose1 == 4) {
				bankAccount.atualState();
			}
			if(choose1 == 5) {
				bankAccount.payMonthly();
			}
			if(choose1 == 6) {
				System.out.println("Deposit: ");
				double deposit = input.nextDouble();
				bankAccount.deposit(deposit);
			}
		}
	}
}
