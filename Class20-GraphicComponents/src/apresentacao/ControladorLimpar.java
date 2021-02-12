package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	private JComboBox<String> cboFabricante = null;
	private JTextField txtModelo = null;
	private JRadioButton optBranco = null;
	private JCheckBox chkTetoSolar = null;
	
	
	// METODO CONSTRUTOR
	public ControladorLimpar(JComboBox<String> cboFabricante, JTextField txtModelo, JRadioButton optBranco,
			JCheckBox chkTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.optBranco = optBranco;
		this.chkTetoSolar = chkTetoSolar;
	}



	public void actionPerformed(ActionEvent e) {
	cboFabricante.setSelectedIndex(0);
	txtModelo.setText("");
	optBranco.setSelected(true);
	chkTetoSolar.setSelected(false);


	}

}
