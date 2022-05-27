package br.com.fiap.aula3;

public class Functions {
	public static void main(String[] args) {
		double ticketValue = 913.20;
		double reduction = 10;
		double interest = 10;
		double tax = 0.25;
		double reductionresult = reduction(ticketValue, reduction);
		double resultWithInterest = increase(ticketValue, interest);
		double resultWithTax = tax(ticketValue, tax);
		double resultWithTaxValue = taxResult(ticketValue, tax);
		System.out.println("Reduction money: " + reductionresult );
		System.out.println();
		System.out.println("With interest: " + resultWithInterest );
		System.out.println();
		System.out.println("Tax value: " + resultWithTax );
		System.out.println();
		System.out.println("Final value: " + resultWithTaxValue);
		System.out.println("Final value: " + Math.sqrt(9));
	}
	
	//function need return
	public static double reduction(double ticketValue, double reduction) {
		//calculate increase
		return ticketValue - reduction;
	}
	public static double increase(double ticketValue, double interest) {
		//calculate increase
		return ticketValue + interest;
	}
	public static double tax(double ticketValue, double tax) {
		//calculate tax
		return ticketValue *+ tax;
	}			
	
	 public static double taxResult(double ticketValue, double tax) {
		 //value with tax
		 return (ticketValue *+ tax) + ticketValue;
	 }
	 
	 
}

