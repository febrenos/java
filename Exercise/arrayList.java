package test;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		//arrayList sera sempre obj
		ArrayList<String> cars = new ArrayList<String>();
		
		//add element
		boolean b = cars.add("Porsche 911 GT2");//b = true
		cars.add("Dodge 2.0");
		cars.add("Aston martin");
		
		//add by index (in a existent pos)
		cars.add(0, "GT Ford mustang");
		System.out.println("Cars list: " + cars);
		
		//get
		System.out.println("Get: " + cars.get(1));
		
		//set
		System.out.println("Set edited: " + cars.set(1, "Porsche Cayenne 3.0"));
		
		//del element
		cars.remove(0);
		System.out.println("Del: " + cars);
		
		//del all
		cars.clear();
		System.out.println("Clear: " + cars);
		
		//Array list = size() / Array = .length
		System.out.println("Size(): " + cars.size());
		
		//run list i per i FOR
		for(int i=0; i<cars.size(); i++) {
			System.out.printf("%d - %s/n", i+1, cars.get(i));
		}
		//run list i per i FOREACH
		System.out.println("");
		int cont = 1;
		for(String i: cars) {
			System.out.printf("%d - %s/n", cont, i);
			cont++;
		}
		
	}
}
