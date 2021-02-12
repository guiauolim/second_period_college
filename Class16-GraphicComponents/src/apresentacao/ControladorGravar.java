package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorGravar implements ActionListener {

	
	// PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	
	
		
	// METODO CONSTRUTOR DA CLASSE
	public ControladorGravar(JTextField txtNome, JTextField txtEndereco) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		
	}
    
	// METODO IMPLEMENTADO DA CLASSE
	public void actionPerformed(ActionEvent e) {
		if (txtNome.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "Campo Nome � obrigat�rio!");
				return;
		}
		else if (txtEndereco.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo Endere�o � obrigat�rio!");
			return;
		}

	}

}
