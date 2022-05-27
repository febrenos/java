package cp3;

public class PessoaFisica extends Contribuinte{

	private String cpf;
	
	public PessoaFisica(String n, double r, String cpf) {
		super(n, r);
		//this.cpf = cpf;
		this.setCpf(cpf);
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public double calcularImposto() {
		double renda = super.getRendaBruta();
		double imposto = 0;
		
		if(renda <= 1500) {
			imposto = 0;
		}else if(renda>= 1501 && renda<=3000) {
			imposto = (renda*0.075) - 100;
		}else if(renda>3000) {
			imposto = (renda*0.15) - 225;
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Pessoa Física \n cpf: "
				+ this.getCpf() + "\nImposto a ser pago R$ "
				+ this.calcularImposto() + "\n";
	}
	
}
