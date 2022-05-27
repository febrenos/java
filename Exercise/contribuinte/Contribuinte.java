package cp3;

public abstract class Contribuinte{
	
	//atributos
	private String nome;
	private double rendaBruta;
	
	
	public Contribuinte(String nome, double rendaBruta) {
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the rendaBruta
	 */
	public double getRendaBruta() {
		return rendaBruta;
	}

	/**
	 * @param rendaBruta the rendaBruta to set
	 */
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	@Override
	public String toString() {
		return "Contribuinte \n Nome: " + this.getNome() 
		+ "\n Renda Bruta: R$ " + this.getRendaBruta() + "\n"; 
	}
	
	//método abstrato
	public abstract double calcularImposto();
}
