package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorSubtrair implements ActionListener {

	private JTextField txtPrimeiroNumero = null;
	private JTextField txtSegundoNumero = null;
	private JTextField txtResultado = null;
	
	private int subtracao = 0;
	// METODOS CONSTRUTORES
	public ControladorSubtrair(JTextField txtPrimeiroNumero, JTextField txtSegundoNumero, JTextField txtResultado) {
		super();
		this.txtPrimeiroNumero = txtPrimeiroNumero;
		this.txtSegundoNumero = txtSegundoNumero;
		this.txtResultado = txtResultado;
	}

	public void actionPerformed(ActionEvent arg0) {
		 try {
			 if (Integer.parseInt(txtPrimeiroNumero.getText()) > Integer.parseInt(txtSegundoNumero.getText())) {
				 subtracao = (Integer.parseInt(txtPrimeiroNumero.getText()) - Integer.parseInt(txtSegundoNumero.getText()));
			 } else {
				 JOptionPane.showMessageDialog(null, "Primeiro número deve ser maior que o segundo!");
			 }
		 
			 
		 		 
		 txtResultado.setText("" + subtracao);
		 } catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Somente números!");
		}
		
		 txtPrimeiroNumero.setText("");
		 txtSegundoNumero.setText("");


	}

}
