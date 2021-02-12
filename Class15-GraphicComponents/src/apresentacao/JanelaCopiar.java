package apresentacao;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaCopiar extends JFrame{
	// PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPanel = new JPanel();
	
	// WMÉTODO CONSTRUTOR
	public JanelaCopiar() {
		setTitle("Janela Copiar");
		setSize(800,600);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setContentPane(objPanel);
		
		objPanel.add(new Label("Primeiro texto nessa porra "));
	}
	

}
