package cp3;

import java.util.ArrayList;

public class Contribuintes{
	
	//criando um ArrayList
	private ArrayList<Contribuinte> contribuintes;
	
	public Contribuintes() {
		contribuintes = new ArrayList<Contribuinte>();
	}
	
	public void adicionarContribuintes(Contribuinte c) {
		if(c != null) {
			contribuintes.add(c);
		}
	}
	
	public void apresentarContribuites() {
		for(Contribuinte c: contribuintes) {
			System.out.println(c.toString());
		}
	}
	
}