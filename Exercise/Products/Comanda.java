import java.util.ArrayList;

public class Comanda {
	//	item comanda
	//	private List[] list = null;
	private  new ArrayList<ItemComanda>() list = new ArrayList<ItemComanda>();
	
	public Comanda() {
		list = new ArrayList<ItemComanda>();
	}
	
	public void RegistrarItem(ItemComanda i) {
		list.add(i);
	}
	
	public float CalcValorFinal() {
		float total = 0.0f;
		//item in list
		//while, foreach
		for(ItemComanda i : list) {
			total += i.calculaPreco();
		}
		return total;
	}
	
	public void imprimirDados() {
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
}
