package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Variavel Global RG acessivel a todos os metodos */

	static String rg = "34.564.419-0";

	/* Main � um metodo auto executavel em java */

	public static void main(String[] args) {

		/* Escreve texto console */

		System.out.println("Curso Full Stack Java Web");
		System.out.println("O Java � orientado a objetos");

		int num1 = 3;
		int num2 = 2;
		int num3 = num1 + num2;

		System.out.println(num1 + num2);
		System.out.println(num3 * 3);

		/* O valor padrao de uma variavel nao declarada o valor, � sempre zero */

		int num4;
		int num5 = 0;

		System.out.println(num5);

		/* Tipo de variaveis e dados */

		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7;
		String cpf = "34.564.419-0"; /* CPF � uma string pois se declarar como int ele estoura */
		System.out.println("O numero do meu cpf � = " + cpf);
		System.out.println("A maior idade � " + maiorIdade + " anos");
		System.out.println("O numero do RG dele no metodo1 � " + rg);
		metodo2();
	}

	public static void metodo2() {

		int mediaAno = 50;

		System.out.println("O RG dele no metodo2 � " + rg);
		System.out.println(mediaAno);
		metodo3();
	}

	public static void metodo3() {

		System.out.println("O RG no metodo 3 � " + rg);

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

		System.out.println("M�dia usando o recurso double para casas decimais � = " + mediaFinal);

		/* CHAR representa uma letra */

		char sexoFeminino = 'F';
		char sexoMasculino = 'M';

		if (sexoFeminino == 'F') {

			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}
		/* String no Java ser� texto de tamanho qualquer */

		String textoQualquer = "wfjhwifhihgwighweijghwijgighihgihgihgiwe";
		System.out.println(textoQualquer);
		/* Por exemplo cadastro de uma pessoa em um sistema � STRING */
		/* Exemplo de concatena��o de STRING */

		String nome = "Odair Pedroso Junior";
		String cpf = "34.564.419.0";
		String telefone = "011 996994487";
		String endereco = "Rua Paulo Carboni , 3450";
		int idade = 38;

		System.out.println("Meu nome � " + nome + " com meu cpf de n�mero = " + cpf + " de n�mero de telefone "
				+ telefone + " onde meu endere�o � " + endereco + " minha idade � :" + idade + " anos.");

		String saida = "Meu nome � " + nome + " com meu cpf de n�mero = " + cpf + " de n�mero de telefone " + telefone
				+ " onde meu endere�o � " + endereco + " e a minha idade � :" + idade + " anos.";

		System.out.println(saida);

		int mediaAluno = 69;
		String name = "Odair";

		if (mediaAluno >= 70 && name.equals("Odair")) {

			System.out.println("Aluno aprovado");

		} else if (mediaAluno < 70 && name.equals("Evair")) {

			System.out.println("Aluno reprovado");
		} else {
			System.out.println("Aluno n�o encontrado na base");
		}

		int n1 = 100;
		int n2 = 100;
		int n3 = 100;
		int n4 = 100;
		int mediafinal = 0;

		mediafinal = (n1 + n2 + n3 + n4) / 4;
		
		/* condi��es logicas com if e else */

		if (mediafinal >= 70) {
			System.out.println("Aluno aprovado com a m�dia final de : " + mediafinal);

		} else if (mediafinal >= 40 && mediafinal <= 69) {
			System.out.println("Aluno em recupera��o com m�dia final de : " + mediafinal);
		} else {
			System.out.println("Aluno reprovado com a m�dia final de : " + mediafinal);
		}
		
		/*Operadores Tern�rios s�o para micro valida��es*/
		
		int n5 = 70;
		int n6 = 70;
		int n7 = 70;
		int n8 = 70;
		int mediaFinal2 = 0;
		
		mediaFinal2 = (n5 + n6+ n7 + n8) / 4;
		
		String saidaResultado = mediaFinal2 >=70 ? "Aluno Aprovado" :
			(mediaFinal2 >= 40 && mediaFinal2 <= 69) ? "Aluno em Recupera��o":"Aluno Reprovado";
		
		System.out.println(saidaResultado);
		
		
		/* opera��es logicas aninhadas ( opera��es dentro de opera��es )*/
		
		if (mediaFinal2 >=50) {			
						
			if (mediaFinal2>=70) {
				
				if(mediaFinal2>=90) {
					System.out.println("Aluno esta aprovado direto : Parab�ns " + mediaFinal2);
				}else {
					System.out.println("Aluno Aprovado Direto " + mediaFinal2);
				}
				
			}else {
				System.out.println("Aluno em recupera��o " + mediaFinal2);
			}
			
		}else {
			System.out.println("Aluno Reprovado Direto " + mediaFinal2);
		}
		
		
		/*SWITCH CASE : OPERA��ES EXATAS*/		
		
		int dia =3;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("ter�a-feira");
			break;

		default:System.out.println("outro dia qualquer");
			break;
		}
		
		
		/*Operadores relacionais */
		
		int n10 = 90;
		int n11 = 91;
		
		if(n10 != n11) {
			System.out.println("as notas s�o diferentes");
		}else {
			System.out.println("as notas s�o iguais");
		}
		
		if(n10<n11) {
			System.out.println(n10 + " � menor que " + n11);
		}else {
			System.out.println(n10 + " � maior que " + n11);
		}
		
		/* Estrutura de repeti��o While ; Verifica a condi��o e depois executa */
		
		int numero = 0;
		while(numero <=5) {
			System.out.println("O numero atual � : " + numero);
			numero=numero+1;
		}	
		
		/* DO While = primeiro executa e depois verifica a condi��o*/
		
		int numero2 = 0;
		
		do {
			System.out.println("O numero atual � : " + numero2);
			numero2++;
			
		}while(numero2 <=80);
		
		/* Estrutura de repeti��o FOR */
		
		for(int numeroFor =0;numeroFor<=15;numeroFor++) {
			System.out.println("O n�mero atual � : " + numeroFor);
			
		}
		for(int numeroFor2 = 10 ; numeroFor2>=0 ;numeroFor2-- ) {
			System.out.println("A sequencia FOR decrescente � : " + numeroFor2);
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
			
			System.out.println("Processando la�o de repeti��o na lista");
		}
		
		/* Modulo : Resto da divis�o %*/
		
		double carro = 9;
		double pessoa = 2;
		
		double resto = carro % pessoa;
		
		System.out.println("Sobraram exatamente " + resto + " carros.");
		
		/* Programa de carros e pessoas manipulando dados de entrada */
		
		String carros = JOptionPane.showInputDialog("Informe o n�mero de carros");/* solicitando dados do usu�rio*/
		String pessoas = JOptionPane.showInputDialog("Informe o n�mero de pessoas");
		
		double carroNumero = Double.parseDouble(carros); /*Manipulando as entradas de dados do usuario*/
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);/* Realizando opera��es com os dados manipulados*/
		double restante = carroNumero % pessoaNumero ; 
		
		
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESULTADO da divis�o ?");
		
		if(resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "Divis�o para pessoas deu " + divisao);
		}else {
			System.out.println("Usu�rio n�o quis ver o resultado.");
			
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTANTE da divis�o?");
		
		if(resposta == 0) {
			
			JOptionPane.showMessageDialog(null, "O restante da divis�o foi : " + restante);
		}else {
			System.out.println("Usu�rio n�o quis ver o resultado.");
		}
		
		/* Programa de c�lculo de m�dias de alunos */
		
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
				JOptionPane.showMessageDialog(null, "Voc� esta aprovado com m�dia = " + mediaAnual);
			}else {
				JOptionPane.showMessageDialog(null, "Voc� esta em recupera��o com m�dia = " + mediaAnual);
			}	
			
		}else {
			JOptionPane.showMessageDialog(null, "Voc� esta reprovado com m�dia  = " + mediaAnual);
		} 

	}

}


