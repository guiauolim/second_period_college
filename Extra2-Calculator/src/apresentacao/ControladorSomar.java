package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorSomar implements ActionListener {

	private JTextField txtPrimeiroNumero = null;
	private JTextField txtSegundoNumero = null;
	private JTextField txtResultado = null;
	
	private int soma = 0;
	// METODOS CONSTRUTORES
	public ControladorSomar(JTextField txtPrimeiroNumero, JTextField txtSegundoNumero, JTextField txtResultado) {
		super();
		this.txtPrimeiroNumero = txtPrimeiroNumero;
		this.txtSegundoNumero = txtSegundoNumero;
		this.txtResultado = txtResultado;
	}

	public void actionPerformed(ActionEvent arg0) {
		 try {
			 soma = (Integer.parseInt(txtPrimeiroNumero.getText()) + Integer.parseInt(txtSegundoNumero.getText()));	
			 
		 txtResultado.setText("" + soma + "");
		 } catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Somente n�meros!");
		}
		
		 txtPrimeiroNumero.setText("");
		 txtSegundoNumero.setText("");
		 

	}

}
