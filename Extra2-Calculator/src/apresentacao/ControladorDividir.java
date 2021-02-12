package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorDividir implements ActionListener {

	private JTextField txtPrimeiroNumero = null;
	private JTextField txtSegundoNumero = null;
	private JTextField txtResultado = null;
	
	private int dividir = 0;
	// METODOS CONSTRUTORES
	public ControladorDividir(JTextField txtPrimeiroNumero, JTextField txtSegundoNumero, JTextField txtResultado) {
		super();
		this.txtPrimeiroNumero = txtPrimeiroNumero;
		this.txtSegundoNumero = txtSegundoNumero;
		this.txtResultado = txtResultado;
	}

	public void actionPerformed(ActionEvent arg0) {
		 try {
			 dividir = (Integer.parseInt(txtPrimeiroNumero.getText()) / Integer.parseInt(txtSegundoNumero.getText()));
		 
		 txtResultado.setText("" + dividir);
		 } catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Somente números!");
		}
		
		 txtPrimeiroNumero.setText("");
		 txtSegundoNumero.setText("");

	}

}
