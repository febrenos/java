package cp3;

import aula12_heranca.Pessoa;

public class TesteContribuinte {
	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica("José", 1000, "123.123.123-23");
		PessoaFisica p2 = new PessoaFisica("João", 2000, "231.231.231-31");
		PessoaFisica p3 = new PessoaFisica("Maria", 3000, "321.321.321-21");
		
		PessoaJuridica p4 = new PessoaJuridica("PJ 1", 8000, "44.123.890/0001-44");
		PessoaJuridica p5 = new PessoaJuridica("PJ 2", 10000, "55.123.890/0001-55");
		PessoaJuridica p6 = new PessoaJuridica("PJ 3", 12000, "66.123.890/0001-55");
		
		//criando um vetor de inteiros
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(int i=0; i<contribuintes.length; i++) { //i+=1
			System.out.println(contribuintes[i].toString());
		}
		
		System.out.println("=================================");
		
		Contribuintes lista = new Contribuintes();
		lista.adicionarContribuintes(p1);
		lista.adicionarContribuintes(p2);
		lista.adicionarContribuintes(p3);
		lista.adicionarContribuintes(p4);
		lista.adicionarContribuintes(p5);
		lista.adicionarContribuintes(p6);
		
		lista.apresentarContribuites();
		
	}
}
