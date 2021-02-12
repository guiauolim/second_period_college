package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Fabricante;
import negocio.Veiculo;

public class ControladorGravar implements ActionListener {
	private JComboBox<String> cboFabricante = null;
	private JTextField txtModelo = null;
	private JRadioButton optBranco = null;
	private JRadioButton optPreto = null;
	private JRadioButton optCinza = null;
	private JRadioButton optAmarelo = null;
	private JRadioButton optVermelho	 = null;
	private JRadioButton optVerde = null;
	private JCheckBox chkTetoSolar = null;
	
	
	// METODO CONSTRUTOR
	public ControladorGravar(JComboBox<String> cboFabricante, JTextField txtModelo, JRadioButton optBranco,
			JRadioButton optPreto, JRadioButton optCinza, JRadioButton optAmarelo, JRadioButton optVermelho,
			JRadioButton optVerde, JCheckBox chkTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.optBranco = optBranco;
		this.optPreto = optPreto;
		this.optCinza = optCinza;
		this.optAmarelo = optAmarelo;
		this.optVermelho = optVermelho;
		this.optVerde = optVerde;
		this.chkTetoSolar = chkTetoSolar;
	}



	public void actionPerformed(ActionEvent e) {
		if (cboFabricante.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Fabricante' é obrigatório!");
			return;
		}
		if (txtModelo.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo 'Modelo' é obrigatório!");
			return;
		}
		
		
		// COMPOSIÇÃO
		Veiculo objVeiculo = new Veiculo();
		objVeiculo.setObjFabricante(new Fabricante(cboFabricante.getSelectedItem().toString()));
		objVeiculo.setModelo(txtModelo.getText());
		
		if (optBranco.isSelected()) {
			objVeiculo.setCor(1);
		} else if (optPreto.isSelected()) {
			objVeiculo.setCor(2);
		} else if (optCinza.isSelected()) {
			objVeiculo.setCor(3);
		} else if (optAmarelo.isSelected()) {
			objVeiculo.setCor(4);
		} else if (optVermelho.isSelected()) {
			objVeiculo.setCor(5);
		} else if (optVerde.isSelected()) {
			objVeiculo.setCor(6);
		}else {
			objVeiculo.setCor(7);
		}
		
		objVeiculo.setTetoSolar(chkTetoSolar.isSelected());
		
		JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso! \r\n\r\n" + 
		                                    "Fabricante: " + objVeiculo.getObjFabricante().getNome() + "\r\n" +
				                            "Modelo: " + objVeiculo.getModelo() + "\r\n" + 
		                                    "Cor: " + objVeiculo.getNomeCor() + "\r\n" + 
				                            "Teto Solar: " + (objVeiculo.isTetoSolar() ? "SIM" : "NÃO"));
		

	}


	
}
