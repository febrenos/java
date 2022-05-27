package heranca;

import java.util.Date;

public class Pessoa {
	
	
	public float tirarCopias(int qtde) {
		double preco = 0.10;
		
		return (float) (0.10 * qtde);
		
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

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	//atributos
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	public Pessoa(String nome, String cpf, Date dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNasc;
		
	
		
	}

}
