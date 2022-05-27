package exercicio1;

public class Contador {
	int num = 10;
	
	public void zerar() {
		num = 0;
	}
	
	public void incrementar() {
		num = num + 1;
	}
	
	public void retorno() {
		System.out.println("O valor do contador é: " + num);
	}
	
	public static void main(String[] args) {
		Contador objeto = new Contador();
		
		objeto.zerar();
		objeto.incrementar();
		objeto.retorno();
	}
}