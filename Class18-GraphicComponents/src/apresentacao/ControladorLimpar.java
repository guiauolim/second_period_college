package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// PROPRIEDADES
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	// METODO CONSTRUTOR CHEIO
	public ControladorLimpar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}
	
	// METODO DA AÇÃO DO BOTÃO
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		optMasculino.setSelected(true);
		txtEndereco.setText("");
		cboUf.setSelectedIndex(0);

	}

}
