package cursojava.objetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class testeObjeto {
	
	public static void main(String[] args) {		
		
		
		try {
		
			
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");		
					
		
		if(new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) { /*vou travar o contrato para autorizar somente quem tem o contrato 100% legitimo*/
		
		
		List<Aluno> alunos = new ArrayList<Aluno>(); /* Instanciando lista de alunos*/
		
		/* HashMap  é uma lista , dentro dela temos uma chave que identifica uma sequencia de valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		
		
		
		/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
		
		
		for(int qtd = 1;qtd <= 2;qtd++) {
		
		/* new Aluno() é uma instancia (criar um objeto)*/
		
		/* aluno 1, aluno 2 , aluno 3 é uma referencia ao objeto Aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+ "?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno ?");
		/*String dataNascimento = JOptionPane.showInputDialog("Qual a data nascimento do aluno ?");
		String rg = JOptionPane.showInputDialog("Qual o rg ?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf ?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae ?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula ?");
		String serie = JOptionPane.showInputDialog("Qual a serie ?");
		String escola = JOptionPane.showInputDialog("Qual a escola ?");*/
		
		
		
		
		Aluno aluno1 = new Aluno(); 
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);*/
		
		for (int pos = 1; pos<=1 ; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			/*disciplina.setNota(Double.valueOf(notaDisciplina));*/
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/* Remover uma disciplina da lista de disciplinas*/
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha ==0) {
			
			int continuarRemover = 0;
			int posicao=1;
			
			while(continuarRemover ==0) {
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover, 1,2,3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao++;/*soma +1*/
			continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo ? ");
			}
		}
		
		alunos.add(aluno1);
		
		}
		
		/* Inicializando o mapa hashmap com 3 listas vazias*/
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		
		/* Percorrer a lista e separar os alunos aprovados , recuperação e reprovados*/
		
		for (Aluno aluno : alunos) { /* Separamos em listas*/
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				
				/*alunosAprovados.add(aluno);*/
			}else
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				
				/*alunosRecuperacao.add(aluno);*/
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
				
				/*alunosReprovados.add(aluno);*/ /*Reprovado*/
			}			
			
		}
		
		System.out.println("-------------Lista dos Aprovados---------------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("O aluno = " + aluno.getNome() + " teve o resultado = " + aluno.getAlunoAprovado2()+ " com média de = " +aluno.getMediaNota());			
		}
		
		System.out.println("-------------Lista dos Reprovados---------------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("O aluno = "+ aluno.getNome() +" teve o resultado = " + aluno.getAlunoAprovado2()+ " com média de = " +aluno.getMediaNota());			
		}
		
		System.out.println("-------------Lista dos Alunos em Recuperação---------------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("O aluno = " + aluno.getNome() + " teve resultado = " + aluno.getAlunoAprovado2()+ " com média de = " +aluno.getMediaNota());			
		}
	  }else {
		  JOptionPane.showMessageDialog(null, "Acesso negado.");
	  }
		
		/* Aqui */
		
		}catch (NumberFormatException e) { /* Captura somente a NumberFormatException*/
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); /* Imprime erro no console Java */
			
			/* Mais recursos da classe Exception : você pode printar o erro que esta ocorrendo :*/
			
			System.out.println("Mensagem do erro : " + e.getMessage());
			
			/* Percorrendo o Array e.getStackTrace e retornando os parametros de erro que desejar*/
			
			for (int pos=0 ; pos< e.getStackTrace().length;pos++) {
				
				saida.append("\nClasse do erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\nMétodo do erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\nLinha do erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\nLinha do erro : " + e.getStackTrace()[pos].getClass());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de conversao numero : " + saida.toString());
			
				
			
		
		}finally { /* sempre é executado ocorrendo erros ou nao , servindo em muitos casos para finalizar uma transação no banco de dados dando certo ou nao*/
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java");
		}
				
	}
	
	

}













