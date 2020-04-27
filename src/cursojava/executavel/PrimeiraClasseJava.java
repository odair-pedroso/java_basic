package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Variavel Global RG acessivel a todos os metodos */

	static String rg = "34.564.419-0";

	/* Main é um metodo auto executavel em java */

	public static void main(String[] args) {

		/* Escreve texto console */

		System.out.println("Curso Full Stack Java Web");
		System.out.println("O Java é orientado a objetos");

		int num1 = 3;
		int num2 = 2;
		int num3 = num1 + num2;

		System.out.println(num1 + num2);
		System.out.println(num3 * 3);

		/* O valor padrao de uma variavel nao declarada o valor, é sempre zero */

		int num4;
		int num5 = 0;

		System.out.println(num5);

		/* Tipo de variaveis e dados */

		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		String cpf = "34.564.419-0"; /* CPF é uma string pois se declarar como int ele estoura */
		System.out.println("O numero do meu cpf é = " + cpf);
		System.out.println("A maior idade é " + maiorIdade + " anos");
		System.out.println("O numero do RG dele no metodo1 é " + rg);
		metodo2();
	}

	public static void metodo2() {

		int mediaAno = 50;

		System.out.println("O RG dele no metodo2 é " + rg);
		System.out.println(mediaAno);
		metodo3();
	}

	public static void metodo3() {

		System.out.println("O RG no metodo 3 é " + rg);

		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;

		System.out.println("Media das notas = " + (nota1 + nota2 + nota3 + nota4) / 4);

		/* Variaveis com valor tipo double ( casas decimais ) */

		double nota5 = 90;
		double nota6 = 70;
		double nota7 = 50;
		double nota8 = 88;
		double mediaFinal = (nota5 + nota6 + nota7 + nota8) / 4;

		System.out.println("Média usando o recurso double para casas decimais é = " + mediaFinal);

		/* CHAR representa uma letra */

		char sexoFeminino = 'F';
		char sexoMasculino = 'M';

		if (sexoFeminino == 'F') {

			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}
		/* String no Java será texto de tamanho qualquer */

		String textoQualquer = "wfjhwifhihgwighweijghwijgighihgihgihgiwe";
		System.out.println(textoQualquer);
		/* Por exemplo cadastro de uma pessoa em um sistema é STRING */
		/* Exemplo de concatenação de STRING */

		String nome = "Odair Pedroso Junior";
		String cpf = "34.564.419.0";
		String telefone = "011 996994487";
		String endereco = "Rua Paulo Carboni , 3450";
		int idade = 38;

		System.out.println("Meu nome é " + nome + " com meu cpf de número = " + cpf + " de número de telefone "
				+ telefone + " onde meu endereço é " + endereco + " minha idade é :" + idade + " anos.");

		String saida = "Meu nome é " + nome + " com meu cpf de número = " + cpf + " de número de telefone " + telefone
				+ " onde meu endereço é " + endereco + " e a minha idade é :" + idade + " anos.";

		System.out.println(saida);

		int mediaAluno = 69;
		String name = "Odair";

		if (mediaAluno >= 70 && name.equals("Odair")) {

			System.out.println("Aluno aprovado");

		} else if (mediaAluno < 70 && name.equals("Evair")) {

			System.out.println("Aluno reprovado");
		} else {
			System.out.println("Aluno não encontrado na base");
		}

		int n1 = 100;
		int n2 = 100;
		int n3 = 100;
		int n4 = 100;
		int mediafinal = 0;

		mediafinal = (n1 + n2 + n3 + n4) / 4;
		
		/* condições logicas com if e else */

		if (mediafinal >= 70) {
			System.out.println("Aluno aprovado com a média final de : " + mediafinal);

		} else if (mediafinal >= 40 && mediafinal <= 69) {
			System.out.println("Aluno em recuperação com média final de : " + mediafinal);
		} else {
			System.out.println("Aluno reprovado com a média final de : " + mediafinal);
		}
		
		/*Operadores Ternários são para micro validações*/
		
		int n5 = 70;
		int n6 = 70;
		int n7 = 70;
		int n8 = 70;
		int mediaFinal2 = 0;
		
		mediaFinal2 = (n5 + n6+ n7 + n8) / 4;
		
		String saidaResultado = mediaFinal2 >=70 ? "Aluno Aprovado" :
			(mediaFinal2 >= 40 && mediaFinal2 <= 69) ? "Aluno em Recuperação":"Aluno Reprovado";
		
		System.out.println(saidaResultado);
		
		
		/* operações logicas aninhadas ( operações dentro de operações )*/
		
		if (mediaFinal2 >=50) {			
						
			if (mediaFinal2>=70) {
				
				if(mediaFinal2>=90) {
					System.out.println("Aluno esta aprovado direto : Parabéns " + mediaFinal2);
				}else {
					System.out.println("Aluno Aprovado Direto " + mediaFinal2);
				}
				
			}else {
				System.out.println("Aluno em recuperação " + mediaFinal2);
			}
			
		}else {
			System.out.println("Aluno Reprovado Direto " + mediaFinal2);
		}
		
		
		/*SWITCH CASE : OPERAÇÕES EXATAS*/		
		
		int dia =3;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;

		default:System.out.println("outro dia qualquer");
			break;
		}
		
		
		/*Operadores relacionais */
		
		int n10 = 90;
		int n11 = 91;
		
		if(n10 != n11) {
			System.out.println("as notas são diferentes");
		}else {
			System.out.println("as notas são iguais");
		}
		
		if(n10<n11) {
			System.out.println(n10 + " é menor que " + n11);
		}else {
			System.out.println(n10 + " é maior que " + n11);
		}
		
		/* Estrutura de repetição While ; Verifica a condição e depois executa */
		
		int numero = 0;
		while(numero <=5) {
			System.out.println("O numero atual é : " + numero);
			numero=numero+1;
		}	
		
		/* DO While = primeiro executa e depois verifica a condição*/
		
		int numero2 = 0;
		
		do {
			System.out.println("O numero atual é : " + numero2);
			numero2++;
			
		}while(numero2 <=80);
		
		/* Estrutura de repetição FOR */
		
		for(int numeroFor =0;numeroFor<=15;numeroFor++) {
			System.out.println("O número atual é : " + numeroFor);
			
		}
		for(int numeroFor2 = 10 ; numeroFor2>=0 ;numeroFor2-- ) {
			System.out.println("A sequencia FOR decrescente é : " + numeroFor2);
		}
		
		/*Estrutura FOR com Break (parada)*/
		
		for (int numeroFor3 = 0;numeroFor3<=10;numeroFor3++) {
			if (numeroFor3 == 3) {
				System.out.println("Encontrei o numero chave = 3");
				System.out.println("Parar processamento....");
				break;
			}
		}
		
		/* Estrutura FOR com Continue */
		
		for (int numeroFor4 = 0;numeroFor4 <= 10;numeroFor4 ++) {
			if (numeroFor4 == 3 ||numeroFor4 == 6 || numeroFor4 == 9) {
				System.out.println("Encontrei o numero chave = " + numeroFor4);				
				continue;
			}
			
			System.out.println("Processando laço de repetição na lista");
		}
		
		/* Modulo : Resto da divisão %*/
		
		double carro = 9;
		double pessoa = 2;
		
		double resto = carro % pessoa;
		
		System.out.println("Sobraram exatamente " + resto + " carros.");
		
		/* Programa de carros e pessoas manipulando dados de entrada */
		
		String carros = JOptionPane.showInputDialog("Informe o número de carros");/* solicitando dados do usuário*/
		String pessoas = JOptionPane.showInputDialog("Informe o número de pessoas");
		
		double carroNumero = Double.parseDouble(carros); /*Manipulando as entradas de dados do usuario*/
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);/* Realizando operações com os dados manipulados*/
		double restante = carroNumero % pessoaNumero ; 
		
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESULTADO da divisão ?");
		
		if(resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);
		}else {
			System.out.println("Usuário não quis ver o resultado.");
			
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTANTE da divisão?");
		
		if(resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "O restante da divisão foi : " + restante);
		}else {
			System.out.println("Usuário não quis ver o resultado.");
		}
		
		/* Programa de cálculo de médias de alunos */
		
		String nota10 = JOptionPane.showInputDialog("Informe a nota 1 : ");
		String nota11 = JOptionPane.showInputDialog("Informe a nota 2 : ");
		String nota12 = JOptionPane.showInputDialog("Informe a nota 3 : ");
		String nota13 = JOptionPane.showInputDialog("Informe a nota 4 : ");
		
		double nota20 = Double.parseDouble(nota10);
		double nota21 = Double.parseDouble(nota11);
		double nota22 = Double.parseDouble(nota12);
		double nota23 = Double.parseDouble(nota13);
		
		double mediaAnual = (nota20 + nota21 + nota22 + nota23)/4;		
		
				
		if (mediaAnual >=50) {
			
			if(mediaAnual >=70) {
				JOptionPane.showMessageDialog(null, "Você esta aprovado com média = " + mediaAnual);
			}else {
				JOptionPane.showMessageDialog(null, "Você esta em recuperação com média = " + mediaAnual);
			}	
			
		}else {
			JOptionPane.showMessageDialog(null, "Você esta reprovado com média  = " + mediaAnual);
		} 

	}

}


