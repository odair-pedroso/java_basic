package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso  {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	
	/* Construtor padrao do Secretario*/
	public Secretario(String login,String senha) {
		this.login = login;
		this.senha = senha;
		
	}
	
	public Secretario() {
		
	}
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override /* Identifica metodos sobrescrito*/
	public boolean pessoaMaiorIdade() {	
		
		
		return idade >=21;
	}

	public String msgMaiorIdade () {
		
		return this.pessoaMaiorIdade()?"maior de idade":"menor de idade";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500 * 1.2;
	}
	
	
	/* Esse é o metodo do contrato de autenticação */
	
	
	/*metodo autenticar com parametro*/
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
		return autenticar();
	}
	
	/* método autenticar com interface*/
	@Override
	public boolean autenticar() {
		
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
	
	

}
