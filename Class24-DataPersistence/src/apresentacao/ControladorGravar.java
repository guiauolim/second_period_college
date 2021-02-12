package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cliente;
import negocio.Compra;
import negocio.Produto;

public class ControladorGravar implements ActionListener {
	private JComboBox<String> cboProduto = null;
	private JComboBox<String> cboCliente = null;
	private JTextField txtData = null;
	private JTextField txtQuantidade = null;
	
	

	public ControladorGravar(JComboBox<String> cboProduto, JComboBox<String> cboCliente, JTextField txtData,
			JTextField txtQuantidade) {
		super();
		this.cboProduto = cboProduto;
		this.cboCliente = cboCliente;
		this.txtData = txtData;
		this.txtQuantidade = txtQuantidade;
	}


	public void actionPerformed(ActionEvent e) {
		// CRITICAS DE DADOS
		Compra objCompra = new Compra();
		if (cboProduto.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Produto' é obrigatório!");
			return;
		}
		if (cboCliente.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Cliente' é obrigatório!");
			return;
		}
		if (txtData.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Data' é obrigatório!");
			return;
		}
		try {
			objCompra.setData(txtData.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Campo 'Data' em formato inválido!");
			return;
		}
		if (txtQuantidade.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Quantidade' é obrigatório!");
			return;
		}
		try {
			Integer.parseInt(txtQuantidade.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Campo 'Quantidade' em formato inválido!");
			return;
		}
		
		// COMPOSIÇÃO DO OBJETO
		try {
			objCompra.setObjProduto(new Produto(cboProduto.getSelectedIndex(), "", 0));
			objCompra.setObjCliente(new Cliente(cboCliente.getSelectedIndex(), "", ""));
			objCompra.setData(txtData.getText());
			objCompra.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
			
			objCompra.persistir();
			
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
			
			new ControladorLimpar(cboProduto, cboCliente, txtData, txtQuantidade).actionPerformed(null);
				
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
	}

}
