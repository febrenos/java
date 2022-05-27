package exercicio3;

import java.util.Scanner;

public class Conta {
	String nome;
	int conta = 12345;
	float saldo;
	float valor;
	int escolha;
	
	public static float depositar(float saldo, float valor) {
		return saldo + valor;
	}
	
	public static float sacar(float saldo, float valor) {
		return saldo - valor;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta banco = new Conta();
		
		int conta = 12345;
		float valor;
		int escolha = 0;
		
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Digite o valor que você tem na conta: ");
		float saldo = input.nextFloat();
		
		System.out.println("Digite 1 para depositar e 2 para sacar: ");
		escolha = input.nextInt();
		
		if(escolha == 1) {
			System.out.println("Digite o valor que deseja depositar: ");
			valor = input.nextFloat();
			float deposito = depositar(saldo, valor);
			
			System.out.println("O número da conta é: " + conta);
			System.out.println("O " + nome + " depositou " + valor + "\nO novo saldo é de: " + deposito);
		}
		
		else if(escolha == 2) {
			System.out.println("Digite o valor que deseja sacar: ");
			valor = input.nextFloat();
			float saque = sacar(saldo, valor);
			
			System.out.println("O número da conta é: " + conta);
			System.out.println("O " + nome + " sacou " + valor + "\nO novo saldo é de: " + saque);
		}
		
		else {
			System.out.println("Você digitou uma opção inválida");
		}
		
		input.close();
	}
}
