package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ControladorGravar implements ActionListener {
	
	// PROPRIEDADES DA CLASSE
	private JComboBox<String> cboCores = null;
	private JCheckBox cbkAtendimentoEspecial = null;
	private JCheckBox cbkArCondicionado = null;
	private JRadioButton optManha = null;
	private JRadioButton optTarde = null;
	
	// METODO CONSTRUTOR CHEIO
	public ControladorGravar(JComboBox<String> cboCores, JCheckBox cbkAtendimentoEspecial, JCheckBox cbkArCondicionado,
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
		if (cboCores.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo cores é obrigatorio!");
			return;
		}
	JOptionPane.showMessageDialog(null, "Cor escolhida: " + cboCores.getSelectedItem() + "\r\n" +
	                                    (cbkAtendimentoEspecial.isSelected() ? "Atendimento Especial solicitado!" : "") + "\r\n" +
	                                    (cbkArCondicionado.isSelected() ? "Ar Condicionado Solicitado! " : "") + "\r\n" +
	                                    ("Perido solicitado: " + (optManha.isSelected() ? "Manhã" : (optTarde.isSelected() ? "Tarde" : "Noite"))));
		}
}