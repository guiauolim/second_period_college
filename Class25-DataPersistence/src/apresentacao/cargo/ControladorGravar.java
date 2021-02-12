package apresentacao.cargo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cargo;

public class ControladorGravar implements ActionListener {
     	// PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JTextField txtSalario = null;
	
	// METODOS CONSTRUTORES
	public ControladorGravar(JTextField txtNome, JTextField txtSalario) {
		super();
		this.txtNome = txtNome;
		this.txtSalario = txtSalario;
	}
	public void actionPerformed(ActionEvent e) {
		// DECLARAÇÃO DE DADOS
		Cargo objCargo = new Cargo();
		
		// CRÍTICAS DE DADOS
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Nome' é obrigatório!");
			return;
		}
		if (txtSalario.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Salário' é obrigatório!");
			return;
		}
		try {
			Double.parseDouble(txtSalario.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Campo 'Salário' em formato inválido!");
		}
		
		// COMPOSIÇÃO DO OBJETO
		try {
			objCargo.setNome(txtNome.getText());
			objCargo.setSalario(Double.parseDouble(txtSalario.getText()));
			
			objCargo.persistir();
			
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
			
			new ControladorLimpar(txtNome, txtSalario).actionPerformed(null);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}

	

	}
}
