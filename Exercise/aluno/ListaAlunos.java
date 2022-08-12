package aula15_1_arrayObjetos;

public class ListaAlunos {
	
	private Aluno[] alunos = null; //array de objetos do tipo Aluno
	int i = 0; //variável de controle do índice
	
	
	//Contrustor criar uma lista com base na qtde de alunos
	public ListaAlunos(int qtde) {
		alunos = new Aluno[qtde];
	}
	
	
	//inserir um aluno na lista
	public void insereAluno(Aluno a) {
		if(i < alunos.length) {
			alunos[i] = a;
			i++;
		}else {
			System.out.println("Elemento não pode ser inserido na lista");
		}	
	}
	
	public void imprimeLista() {
		for(int i=0; i<alunos.length; i++) {
			System.out.println(alunos[i].toString());
		}
	}
	
	
	
	
	
	
	
	
	
}