package apresentacao;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame { // herdar de JFrame quer dizer que a classe � uma janela
	// Propriedade da Classe
     private static final long serialVersionUID = 1L;
     private Painel objPainel = new Painel();
     // M�todo Principal Para Executar o Programa
     public static void main(String[] args) {
		JanelaPrincipal objJanela = new JanelaPrincipal();
		objJanela.setVisible(true); // metodo da classe JFrame que faz a janela aparecer ou n�o.
				
	}
	// M�todo Construtor da Classe
	public JanelaPrincipal() {	
		// Configura��es Da Janela
		setTitle("Primeira Janela da minha Vida");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setContentPane(objPainel);
	}
	

}
