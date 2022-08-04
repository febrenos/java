package review;

import java.util.Scanner;

public class ArrayAndMethods {
	
	public int sizeV(){
		System.out.println("SIZE OF VECTOR");
		Scanner input = new Scanner(System.in);
		System.out.println("New size: ");
		int s = input.nextInt();
		return s;
	}
	
	//arr de int e str
	// um retorno afeta o valor de outro
	//vetor: homogenio e imutavel
	public int[] createV(  s){
		System.out.println("CREATING VECTOR...");
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[s];
		for(int i=0; i<vetor.length; i++){//size / length
			System.out.printf("vetor[%d]: \n", i);
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public void printV( int[] v){
		System.out.println("PRINTING VECTOR...");
		for(int i=0; i<v.length; i++){
			System.out.printf("Vector[%d]:%d",i,v[i]);
		}
	}
	public int valueNum(){
		System.out.println("GET AN NUMBER");
		Scanner input = new Scanner(System.in);
		System.out.println("Number: ");
		int n = input.nextInt();
		return n;
	}
	
	public int verifyOccurrences(int[] v, int n){
		System.out.println();
		int count = 0;
		for(int i=0; i<v.length; i++){
			if(v[i] == n){
				count ++;
			}
		}
		return count;
	}
	
	//can stay in another class
	public static void main(String[] args){
		ArrayAndMethods obj = new ArrayAndMethods();
		int s = obj.sizeV();
		int[] v = obj.createV(s);
		obj.printV(v);
		int n = obj.valueNum();
		int o = obj.verifyOccurrences(v, n);
		System.out.printf("Occurrences of %d = %d", n, o);
	}
}

