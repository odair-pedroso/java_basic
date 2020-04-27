package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();		
		aluno.setNome("Odair Pedroso Junior");
		aluno.setNomeEscola("Joao Pinheiro");
		aluno.setIdade(38);
		
		
		Diretor diretor = new Diretor();		
		diretor.setIdade(28);
		diretor.setNome("Tamara");
		
		
		Secretario secretario = new Secretario();		
		secretario.setRegistroGeral("345644190");
		secretario.setNumeroCpf("30105545830");
		secretario.setNome("Maria");
		secretario.setIdade(3);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println (aluno.pessoaMaiorIdade());
		System.out.println (diretor.pessoaMaiorIdade());
		System.out.println (secretario.pessoaMaiorIdade());
		
		System.out.println(aluno.getNome() + " � " + aluno.msgMaiorIdade());
		System.out.println(diretor.getNome() + " � " + diretor.msgMaiorIdade());
		System.out.println(secretario.getNome() + " � " + secretario.msgMaiorIdade());
		
		System.out.println("O salario de " + aluno.getNome() + " � igual a " + aluno.salario());
		System.out.println("O salario de " + diretor.getNome() + " � igual a " + diretor.salario());
		System.out.println("O salario de " + secretario.getNome() + " � igual a " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);		
				
	}
	
	
	
	public static void teste (Pessoa pessoa) {
		
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() + " e seu salario � " + pessoa.salario());
		}

	

	
}


