package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;
import negocio.Turma;

public class ControladorGravar implements ActionListener {
	// PROPRIEDADES
	private JComboBox<String> cboDisciplina = null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;
	
	// METODO CONSTRUTOR CHEIO
	public ControladorGravar(JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor, JTextField txtLetra) {
		super();
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}

	public void actionPerformed(ActionEvent e) {
		// CRITICA
		if (cboDisciplina.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Disciplina � obrigat�rio!");
			return;
		}
		if (cboProfessor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Professor � obrigat�rio!");
			return;
		}
		if (txtLetra.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo Turma � obrigat�rio!");
			return;
		}
		
		// COMPOSI��O E GRAVA��O DO OBJETO
		Turma objTurma = new Turma();
		objTurma.setObjDisciplina(new Disciplina(cboDisciplina.getSelectedIndex(), ""));
		objTurma.setObjProfessor(new Professor(cboProfessor.getSelectedIndex(), "", ""));
		objTurma.setLetra(txtLetra.getText());
		
		try {
			objTurma.persistir();
			JOptionPane.showMessageDialog(null, "Grava��o realizada com sucesso!");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
	}

}
