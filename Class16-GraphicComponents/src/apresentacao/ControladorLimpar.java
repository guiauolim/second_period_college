package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {

	
	// PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	private JTextArea txtCurriculo = null;
	
		
	// METODO CONSTRUTOR DA CLASSE
	public ControladorLimpar(JTextField txtNome, JTextField txtEndereco, JTextArea txtCurriculo) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		this.txtCurriculo = txtCurriculo;
	}
    
	// METODO IMPLEMENTADO DA CLASSE
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		txtEndereco.setText("");
		txtCurriculo.setText("");

	}

}
