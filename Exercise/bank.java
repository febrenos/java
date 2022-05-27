package bank.com;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		int choose = 1;
		BankAccount bankAccount = new BankAccount();
		while(choose != 0) {
			Scanner input = new Scanner(System.in);
			System.out.println("Type 0 to Stop");
			System.out.println("Type 1 to create");
			System.out.println("Type 2 to close account");
			System.out.println("Type 3 to sacar");
			System.out.println("Type 4 to return all");
			System.out.println("Type 5 pay monthly");
			int choose1 = input.nextInt();
			
			if(choose1 == 0) {
				choose1 = choose1 - choose1;
			}
			if(choose1 == 1){
				bankAccount.createAccount();
			}
			if(choose1 == 2) {
				bankAccount.closeAccount();;
			}
			if(choose1 == 3) {
				System.out.println("Say an value: ");
				int value = input.nextInt();
				bankAccount.takeMoney(value);
			}
			if(choose1 == 4) {
				bankAccount.atualState();
			}
			if(choose1 == 5) {
				bankAccount.payMonthly();
			}
			
		}
	}
}
