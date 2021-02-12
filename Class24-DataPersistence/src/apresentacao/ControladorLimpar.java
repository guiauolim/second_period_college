package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	private JComboBox<String> cboProduto = null;
	private JComboBox<String> cboCliente = null;
	private JTextField txtData = null;
	private JTextField txtQuantidade = null;
	
	

	public ControladorLimpar(JComboBox<String> cboProduto, JComboBox<String> cboCliente, JTextField txtData,
			JTextField txtQuantidade) {
		super();
		this.cboProduto = cboProduto;
		this.cboCliente = cboCliente;
		this.txtData = txtData;
		this.txtQuantidade = txtQuantidade;
	}


	public void actionPerformed(ActionEvent e) {
		cboProduto.setSelectedIndex(0);
		cboCliente.setSelectedIndex(0);
		txtData.setText("");
		txtQuantidade.setText("");

	}

}
