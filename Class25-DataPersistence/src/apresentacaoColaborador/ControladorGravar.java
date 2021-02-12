package apresentacaoColaborador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cargo;
import negocio.Colaborador;

public class ControladorGravar implements ActionListener {
     	// PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JComboBox<String> cboCargo = null;
	
	// METODOS CONSTRUTORES
	public ControladorGravar(JTextField txtNome, JComboBox<String> cboCargo) {
		super();
		this.txtNome = txtNome;
		this.cboCargo = cboCargo;
	}
	public void actionPerformed(ActionEvent e) {
		// DECLARAÇÃO DE DADOS
		Colaborador objColaborador = new Colaborador();
		
		// CRÍTICAS DE DADOS
		if (cboCargo.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Cargo' é obrigatório!");
			return;
		}
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Nome' é obrigatório!");
			return;
		}
		
		
		// COMPOSIÇÃO DO OBJETO
		try {
			objColaborador.setObjCargo(new Cargo (cboCargo.getSelectedIndex(),"", 0	));
			objColaborador.setNome(txtNome.getText());
			
			objColaborador.persistir();
			
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
			
			new ControladorLimpar(txtNome, cboCargo).actionPerformed(null);
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}

	

	}
}
