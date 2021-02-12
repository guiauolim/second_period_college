package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.Tipo;

public class ControladorGravar implements ActionListener {

	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> cboDescricao = null;
	private JTextArea txtAreaDetalhamento = null;
	
	
	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboDescricao,
			JCheckBox chkPerecivel, JTextArea txtAreaDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.cboDescricao = cboDescricao; 
		this.txtAreaDetalhamento = txtAreaDetalhamento;
	}

	
	// METODO IMPLEMENTADO DA CLASSE
	public void actionPerformed(ActionEvent evento) {
		if (txtNome.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Nome' é obrigatório!");
			return;
		} 
		
		
	
     	try {
		Double.parseDouble(txtPreco.getText());
     	} catch (Exception erro) {
		JOptionPane.showMessageDialog(null, "Campo 'Preço' somente caracter númerico!");
     	}	
     	
     	
     	if (Double.parseDouble(txtPreco.getText()) <= 0) {
     		JOptionPane.showMessageDialog(null, "Campo 'Preço' deve ser positivo!		");
     		return;
     	}
     	
	
		if (cboDescricao.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Descrição' é obrigatório!");
			return;
		} 
		
		if (txtAreaDetalhamento.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Detalhamento' é obrigatório!");
			return;
		} 
		
		
		// 	COMPOSIÇÃO DO PRODUTO
		
		Produto objProduto = new Produto();
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		objProduto.setObjTipo(new Tipo(cboDescricao.getSelectedItem().toString()));
		objProduto.setDetalhamento(txtAreaDetalhamento.getText());
		
		
		JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso! \r\n\r\n" +
		                                    "Nome: " + objProduto.getNome() + "\r\n" +    
				                            "Preço: " + objProduto.getPreco() + "\r\n" +
		                                    "Descrição: " + objProduto.getObjTipo() + "\r\n" +
				                            "Detalhamento: " + objProduto.getDetalhamento());	
		
		

	}

}
