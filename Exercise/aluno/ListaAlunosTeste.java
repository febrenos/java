package aula15_1_arrayObjetos;

public class ListaAlunosTeste{
	public static void main(String[] args) {
		//criando uma lista com 3 elementos do tipo Aluno
		ListaAlunos lista = new ListaAlunos(5);
		
		//Criando os objetos Aluno (a1, a2...)
		Aluno a1 = new Aluno(1, "Leandro");
		Aluno a2 = new Aluno(2, "Felipe");
		Aluno a3 = new Aluno(3, "Vinicius");
		Aluno a4 = new Aluno(0, "");
		Aluno a5 = new Aluno(0, "");
	
		
		//inserindo os objetos a1 e a2 (Aluno) na lista
		lista.insereAluno(a1);
		lista.insereAluno(a2);
		lista.insereAluno(a3);
		lista.insereAluno(a4);
		lista.insereAluno(a5);
		
		//imprimindo os elementos da lista
		lista.imprimeLista();
	}
}
