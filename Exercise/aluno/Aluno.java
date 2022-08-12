package aula15_1_arrayObjetos;

public class Aluno{
	
	private int matricula;
	private String nome;
	
	public Aluno(int m, String n) {
		matricula = m;
		nome = n;
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
	
	public String toString() {
		return "Matrícula: " + getMatricula() + "\n" +
				"Nome: " + getNome();
	}	
}