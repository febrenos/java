package cp3;

public class PessoaJuridica extends Contribuinte{
	
	//atributo
	private String cnpj;
	
	public PessoaJuridica(String n, double r, String cnpj) {
		super(n, r);
		this.setCnpj(cnpj);
		
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return super.getRendaBruta() * 0.1;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "Pessoa Jurídica: \ncnpj: "
				+ this.getCnpj()
				+ "\nimposto a ser pago R$ "
				+ this.calcularImposto() + "\n";
	}
}