package test;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
	public static void main(String[] args) {
		
		//STRING
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
		
		//INTERGER
		ArrayList<Interger> num = new ArrayList<Interger>();
		
		num.add(1);
		num.add(-1);
		num.add(3);
		num.add(2);
		
		//for-each loop
		for(int i: num){
			System.out.println(i);
		}
		
		//for loop
		for(int=0; i<num.size(); i++){
			System.out.printf("%d: %d", i, num.get(i));
		}
		
		
		//COLLECTIONS
		Collections.sort(cars);
		Collections.sort(num);
		
		System.out.println(cars);
		System.out.println(num);
		
		//Heterogenic without Generics(<Interger>,<String>) arrayList
		//many types of values
		ArrayList lstHet = new ArrayList();
		lstHet.add(True);
		lstHet.add(1);
		lstHet.add("jeff");
	}
}
