package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;
import negocio.Livro;

public class ControladorGravar implements ActionListener {
	// PROPRIEDADES
	private JTextField txtTitulo = null;
	private JComboBox<String> cboAutor = null;
	
	
	
	// METODO CONSTRUTOR CHEIO
	
	public ControladorGravar(JTextField txtTitulo, JComboBox<String> cboAutor) {
		super();
		this.txtTitulo = txtTitulo;
		this.cboAutor = cboAutor;
	}





	public void actionPerformed(ActionEvent e) {
		// CRITICAS DE DADOS
			if (txtTitulo.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo título é obrigatório!");
				return;
			}
			if (cboAutor.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null, "Campo Autor é obrigatório!");
				return;
			}
 		
		// COMPOSIÇÃO DO OBJETO
			Livro objLivro = new Livro();
			objLivro.setTitulo(txtTitulo.getText());
			objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), cboAutor.getSelectedItem().toString()));
			try {
			objLivro.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, erro	);
			}
			

	}

}