package cursojava.interfaces;

/* Essa interface ser� nosso contrato de autentica��o*/

public interface PermitirAcesso {
	
	
	public boolean autenticar(String login, String senha); /* 2-Metodo para implementar no login e senha restrito a uma classe*/
	
	public boolean autenticar();
}
