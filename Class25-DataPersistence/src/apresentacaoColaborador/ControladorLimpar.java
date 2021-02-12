package apresentacaoColaborador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	private JTextField txtNome = null;
	private JComboBox<String> cboCargo = null;

	
	public ControladorLimpar(JTextField txtNome, JComboBox<String> cboCargo) {
		super();
		this.txtNome = txtNome;
		this.cboCargo = cboCargo;
	}


	public void actionPerformed(ActionEvent arg0) {
		txtNome.setText("");
		cboCargo.setSelectedIndex(0);

	}

}
