
public class ItemComanda{
	private Produto produto;
	private int quantidade;
	
	public ItemComanda(Produto p, int q) {
		produto = p;
		quantidade = q;
	}
	
	//calcula preco
	public float calculaPreco() {
		return produto.getPrecoUnitario() * quantidade;
	}
	
	//print values
	public void imprimirDados() {
		System.out.printf("Produto: %d: \n Descricao: %d \n Quantidade: %d \n Preco:", produto.getCodigo(), produto.getDesc(), quantidade, calculaPreco());
		//toString()
		//return;
	}
	 
}
