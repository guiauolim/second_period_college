package apresentacao;

import java.awt.Color;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VisaoPrincipal extends JFrame {
	// PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	JDesktopPane objContainer = new JDesktopPane();
	
	JMenuBar objBarraDeMenu = new JMenuBar();
	
	JMenu mnuTabelas = new JMenu("Tabelas");
	JMenuItem mniCargo = new JMenuItem("Cargo");
	JMenuItem mniColaborador = new JMenuItem("Colaborador");
	JMenuItem mniSair = new JMenuItem("Sair");
	
	
	JMenu mnuCalculo = new JMenu("C�lculo");
	JMenuItem mniFolhaPagamento = new JMenuItem("Folha de Pagamento");
	
	// METODO PRINCIPAL DE EXECU��O
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	// METODO CONSTRUTOR VAZIO
	public VisaoPrincipal() {
		// CONFIGURA��O DA JANELA
		setTitle("Sistema de C�culos da Folha de Pagamento");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURA��O DO CONTAINER
		objContainer.setBackground(Color.lightGray);
		setContentPane(objContainer);
		
		// CONFIGURA��O DO MENU
		mnuTabelas.add(mniCargo);
		mniCargo.addActionListener(new ControladorCargo(objContainer));
		mnuTabelas.add(mniColaborador);
		mniColaborador.addActionListener(new ControladorColaborador(objContainer));
		mnuTabelas.addSeparator();
		mnuTabelas.add(mniSair);
		mniSair.addActionListener(new ControladorSair());
		
		mnuCalculo.add(mniFolhaPagamento);
		mniFolhaPagamento.addActionListener(new ControladorFolhaPagamento(objContainer));
		
		objBarraDeMenu.add(mnuTabelas);
		objBarraDeMenu.add(mnuCalculo);
		
		setJMenuBar(objBarraDeMenu);
		
	}
	

}
