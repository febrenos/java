package test.pac;

import java.util.Scanner;

public class Box {
	//attributes
	private double y;//height
	private double x;//width
	private double z;//depth
	
	//generate with source
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	//constructors
	public Box() {
		System.out.println("Create box");
		x = 10;
		y = 10;
		z = 10;
	}
	
	//construtor parametrizado
	//sobrecarga
	public Box(double width, double height, double depth) {
		x = width;
		y = height;
		z = depth;
	}
	
	
	public double calculateVol() {
		System.out.println("Calculate box volume");
		double result = x * y * z;
		return result;
	}
	
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setX(20);
		b1.setY(20);
		b1.setZ(20);
		System.out.println("Volume 1: " + b1.calculateVol());
		System.out.println("x: " + b1.getX());
		System.out.println("y: " + b1.getY());
		System.out.println("z: " + b1.getZ());
		
		Box b2 = new Box();
		System.out.println("Volume 2: " + b2.calculateVol());
		System.out.println("===============================");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input values of estructure:");
		System.out.println("x: ");
		double x = input.nextDouble();
		System.out.println("y: ");
		double y = input.nextDouble();
		System.out.println("z: ");
		double z = input.nextDouble();
		
		
		Box b3 = new Box(x,y,z);
		double result = b3.calculateVol();
		System.out.println("Volume b3: " + result);
		
		input.close();
	}
}
