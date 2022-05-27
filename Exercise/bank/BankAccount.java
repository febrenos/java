package bank.com;

import java.util.Scanner;

public class BankAccount {

	private String user;
	private int accountNumber;
	private double accountValue;
	private boolean status;
	private String type;// cc cp

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public double getAccountValue() {
		return accountValue;
	}

	public void setAccountValue(double accountValue) {
		this.accountValue = accountValue;
	}

	public boolean setStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

	public void atualState() {
		System.out.println("ABOUT ACCOUNT");
		System.out.println("User: " + user);
		System.out.println("Num account:" + accountNumber);
		System.out.println("Status: " + status);
		System.out.println("accountValue: " + accountValue);
		System.out.println("CC/CP/Others: " + type);
	}
	public void payMonthly() {
		type = getType();
		if(type == "CC"){
			accountValue = accountValue - 12;
		}
		if(type == "CP"){
			accountValue = accountValue - 20;
		}
	}

	public void createAccount() {// create account
		Scanner input = new Scanner(System.in);
		System.out.println("Write your name: ");
		String user = input.nextLine();
		setUser(user);
		System.out.println("Write your account number: ");
		int accountNumber = input.nextInt();
		setAccountNumber(accountNumber);
		System.out.println("CC/CP/Others: ");
		String type = input.next();
		type = type.toUpperCase();
		setType(type);
		if (this.type.equals("CC")) {//equals(String) / ==(value)
			accountValue = accountValue + 50;
		}
		else if(this.type.equals("CP")) {
			accountValue = accountValue + 150;
		}
		else {
			setType("OTHER");
		}
		System.out.println("Account Created" + "\n");
		status = true;
		
		
	}

	public void closeAccount() {
		status = false;
	}

	public void deposit(double value) {
		this.accountValue += value;
		System.out.println("You deposited");
	}

	public void takeMoney(double value) {
		if (this.accountValue >= value) {
			this.accountValue -= value;
			System.out.println("takeMoney OK");
		} else {
			System.out.println("takeMoney Wrong");
		}
	}

}
