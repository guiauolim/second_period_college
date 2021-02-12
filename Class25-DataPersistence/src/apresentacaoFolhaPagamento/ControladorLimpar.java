package apresentacaoFolhaPagamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextArea;


public class ControladorLimpar implements ActionListener {
	private JTextArea txtResultado = null;
	

	
	public ControladorLimpar(JTextArea txtResultado) {
		super();
		this.txtResultado = txtResultado;
		
	}


	public void actionPerformed(ActionEvent arg0) {
		txtResultado.setText("");
		

	}

}
