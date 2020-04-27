package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog{
	
	public TelaTimeThread() { /* Executa o que estiver dentro no momento da abertura ou execução*/
		
		setTitle("Minha tela de TIME para Threads");
		setSize(new Dimension(300, 300));
		setLocationRelativeTo(null);/* Deixa a tela centralizada após executar*/
		setResizable(false);
		/* Primeira parte da tela concluida*/
		
		
		
		
		
		setVisible(true);/* Sempre o ultimo comando, torna a tela visivel para usuario*/
		
	}

}
