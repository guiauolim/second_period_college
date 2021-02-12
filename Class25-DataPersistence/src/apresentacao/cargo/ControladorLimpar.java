package apresentacao.cargo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
     	// PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JTextField txtSalario = null;
	
	// METODOS CONSTRUTORES
	public ControladorLimpar(JTextField txtNome, JTextField txtSalario) {
		super();
		this.txtNome = txtNome;
		this.txtSalario = txtSalario;
	}
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		txtSalario.setText("");

	}

	

}
