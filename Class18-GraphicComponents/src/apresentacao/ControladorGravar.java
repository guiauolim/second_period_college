package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener {
	// PROPRIEDADES
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	// METODO CONSTRUTOR CHEIO
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco,
			JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}
	
	// METODO DA AÇÃO DO BOTÃO
	public void actionPerformed(ActionEvent e) {
		
		// CRITICA DE DADOS
		if (txtNome.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'NOME' é obrigatório!");
			return;
		} if (txtEndereco.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'ENDEREÇO' é obrigatório!");
			return;
		} else if (cboUf.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'ESCOLHA A UF' é obrigatório!");
			return;
		}
		
		// COMPOSÇÃO DO OBJETO
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		
		objPessoa.setSexo(optMasculino.isSelected());
		
		objPessoa.setEndereco(txtEndereco.getText());
		
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		JOptionPane.showMessageDialog(null,  "Gravação realizada com sucesso! \r\n\r\n" +
		                                     "Nome: " + objPessoa.getNome() + "\r\n" +
				                             "Sexo: " + (objPessoa.isSexo() ? "Masculino" : "Feminino") + "\r\n" +
			                                 "Endereço: " + objPessoa.getEndereco() + "\r\n" +
			                                 "Uf: " + objPessoa.getObjUf().getSigla());
		
	}

}
