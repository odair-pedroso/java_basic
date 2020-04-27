package cursojava.interfaces;

/* Essa interface será nosso contrato de autenticação*/

public interface PermitirAcesso {
	
	
	public boolean autenticar(String login, String senha); /* 2-Metodo para implementar no login e senha restrito a uma classe*/
	
	public boolean autenticar();
}
