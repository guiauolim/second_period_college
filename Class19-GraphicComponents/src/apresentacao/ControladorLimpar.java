package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {

	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> cboDescricao = null;
	private JCheckBox chkPerecivel = null;
	private JTextArea txtAreaDetalhamento = null;
	
	
	public ControladorLimpar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboDescricao,
			JCheckBox chkPerecivel, JTextArea txtAreaDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.cboDescricao = cboDescricao;
		this.chkPerecivel = chkPerecivel;
		this.txtAreaDetalhamento = txtAreaDetalhamento;
	}


	public void actionPerformed(ActionEvent e) {
		
		txtNome.setText("");
		txtPreco.setText("");
		cboDescricao.setSelectedIndex(0);
		chkPerecivel.setSelected(false);
		txtAreaDetalhamento.setText("");
		
		
		

	}

}
