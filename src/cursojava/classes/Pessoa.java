package cursojava.classes;

/* Herança : Classe pai ou classe master ou ainda superclasse ( objeto com atributos comuns as outras classes filhas )*/

public abstract class Pessoa {
	
	protected String nome; /*cada atributo é criado como private, mas podemos alterar para public para acessar os atributos em outras classes*/
	protected String idade;
	protected String dataNascimento;	
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	/* Método abstrato que fica na classe pai abstrata, é obrigatoria para as classes filhas*/
	public abstract double salario();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	/* Metodo que Retorna true se for >= 18 anos */
	
	public boolean pessoaMaiorIdade() {
		return idade >=18;
	}



	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean autenticar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}

