package modulo2.executavel;

import modulo2.classes.Aluno;

public class Poo {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Fulano");
		aluno.setIdade(34);
		aluno.setEscolaridade("SUPERIOR COMPLETO");
		aluno.setEndereco("Av. Paulista");
		aluno.setDataNasc("11/05/1988");
		aluno.setNomeMae("Dona Fulana");
		
		System.out.println("Meu nome é "+aluno.getNome()+", tenho "+aluno.getIdade()+", Moro na "+aluno.getEndereco()+" sou nascido na data "+aluno.getDataNasc()+", tenho o ensino "+aluno.getEscolaridade()+" e minha mãe se chama "+aluno.getNomeMae());
				
	}
	
}
