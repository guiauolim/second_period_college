package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorMultiplicar implements ActionListener {

	private JTextField txtPrimeiroNumero = null;
	private JTextField txtSegundoNumero = null;
	private JTextField txtResultado = null;
	
	private int multiplicacao = 0;
	// METODOS CONSTRUTORES
	public ControladorMultiplicar(JTextField txtPrimeiroNumero, JTextField txtSegundoNumero, JTextField txtResultado) {
		super();
		this.txtPrimeiroNumero = txtPrimeiroNumero;
		this.txtSegundoNumero = txtSegundoNumero;
		this.txtResultado = txtResultado;
	}

	public void actionPerformed(ActionEvent arg0) {
		 try {
		 multiplicacao = (Integer.parseInt(txtPrimeiroNumero.getText()) * Integer.parseInt(txtSegundoNumero.getText()));
		 
		 txtResultado.setText("" + multiplicacao);
		 } catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Somente números!");
		}
		
		 txtPrimeiroNumero.setText("");
		 txtSegundoNumero.setText("");

	}

}
