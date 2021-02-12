package apresentacao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame{
	// PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JMenuBar objBarraDeMenu = new JMenuBar();
	
	private JMenu objArquivo = new JMenu(" Arquivo");
	private JMenuItem objNovo = new JMenuItem(" Novo");
	private JMenuItem objAbrir = new JMenuItem(" Abrir");
	private JMenuItem objSair = new JMenuItem(" Sair");
	
	private JMenu objEditar = new JMenu(" Editar");
	private JMenuItem objCopiar = new JMenuItem(" Copiar");
	private JMenuItem objColar = new JMenu(" Colar");
	
	
	// MÉTODO PRINCIPAL DA CLASSE
	public static void main(String[] args) {
		JanelaPrincipal objJanela = new JanelaPrincipal();
		objJanela.setVisible(true);
	}
	
	// MÉTODO CONSTRUTOR
	public JanelaPrincipal() {
		// CONFIGURAÇÃO DA JANELA
		setTitle("Menu Principal");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAÇÃO DO PAINEL
		setContentPane(objPainel);
		
		// CONFIGURAÇÃO DA BARRA DE MENU
		objArquivo.add(objNovo);
		objArquivo.add(objAbrir);
		objArquivo.addSeparator();
		objArquivo.add(objSair);
		
		objEditar.add(objCopiar);
		objEditar.add(objColar);
		
		objBarraDeMenu.add(objArquivo);
		objBarraDeMenu.add(objEditar);
		
		setJMenuBar(objBarraDeMenu);
		
		// CONFIGURAÇÃO DOS ACTIONS LISTENER
		objSair.addActionListener(new AcaoSair());
		objNovo.addActionListener(new AcaoNovo());
		
		objCopiar.addActionListener(new AcaoCopiar());
		
		
		
		
	}
	

}
