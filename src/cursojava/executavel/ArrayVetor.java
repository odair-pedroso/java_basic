package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	/* Usado para executar codigo.*/
	public static void main(String[] args) {
		
		/* Cria��o do Aluno*/
		
		Aluno aluno = new Aluno(); /* Instanciando aluno*/
		aluno.setIdade("Odair Pedroso Junior"); /* Atribuindo um valor para um atributo do aluno*/
		aluno.setNomeEscola("Unifacef");
		aluno.setSerieMatriculado("P�s Gradua��o : Desenvolvimento de aplica��es WEB e M�veis Escal�veis");
		
		
		
		/*Cria��o da disciplina e inserindo as 4 notas dentro da disciplina*/
		
		Disciplina disciplina = new Disciplina(); /* Instanciando uma disciplina*/
		disciplina.setDisciplina("Java"); /* Atribuindo valor ao atributo */		
		double notasJava[] = {8.8 , 9.7 , 7.6 , 6.8}; /*Criando Array com 4 notas*/		
		disciplina.setNota(notasJava); /*setando as notas da disciplina iniciada ,dentro da disciplina esta o array com 4 notas*/
		
		/* Adicionando a disciplina de 4 notas ao aluno  */
		aluno.getDisciplinas().add(disciplina);
		
		
		/* Criar mais uma disciplina*/
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de Programa��o");
		double notasLogica[] = {7.1 , 5.7 , 9.6 , 7.8};
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina2);
		
		
		//------------------------------------------------------------------------------------------------------------------------
		
		Aluno[]arrayAlunos = new Aluno[1];
		
		arrayAlunos[0]=	aluno;
		
		
		for(int pos = 0; pos < arrayAlunos.length ; pos++) { /* Percorrendo Array com nome de aluno*/
			
			System.out.println("O nome do Aluno � " + arrayAlunos[pos].getNome());
			
			
			for (Disciplina disciplinas : arrayAlunos[pos].getDisciplinas()) { /* Percorrendo a lista de disciplinas e pegando a disciplina do aluno*/
				System.out.println("A disciplina do aluno  " + arrayAlunos[pos].getNome() + " � " + disciplinas.getDisciplina());
				
				for(int posnota = 0; posnota < disciplinas.getNota().length ; posnota++) {
					System.out.println("A nota numero : " + (posnota+1) + " � igual = "+ disciplinas.getNota()[posnota]);
				}
				
			}
		}
	}
}		
		
				
		
