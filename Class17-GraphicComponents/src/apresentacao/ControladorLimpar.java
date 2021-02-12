package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class ControladorLimpar implements ActionListener {
	
	// PROPRIEDADES DA CLASSE
	private JComboBox<String> cboCores = null;
	private JCheckBox cbkAtendimentoEspecial = null;
	private JCheckBox cbkArCondicionado = null;
	private JRadioButton optManha = null;
	private JRadioButton optTarde = null;
	
	// METODO CONSTRUTOR CHEIO
	public ControladorLimpar(JComboBox<String> cboCores, JCheckBox cbkAtendimentoEspecial, JCheckBox cbkArCondicionado,
			JRadioButton optManha, JRadioButton optTarde) {
		super();
		this.cboCores = cboCores;
		this.cbkAtendimentoEspecial = cbkAtendimentoEspecial;
		this.cbkArCondicionado = cbkArCondicionado;
		this.optManha = optManha;
		this.optTarde = optTarde;
	}
	
	// METODO IMPLEMNTADO DA INTERFACE
	public void actionPerformed(ActionEvent e) {
		cboCores.setSelectedIndex(0);
		
		cbkAtendimentoEspecial.setSelected(false);
		cbkArCondicionado.setSelected(false);
		
		optManha.setSelected(true);
		optTarde.setSelected(false);
		}
}
		



	



