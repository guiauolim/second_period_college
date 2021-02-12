package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisaoCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblInterrogação = new JLabel("?");
	private JLabel lblIgual = new JLabel("=");
	
	private JTextField txtPrimeiroNumero = new JTextField();
	private JTextField txtSegundoNumero = new  JTextField();
	private JTextField txtResultado = new JTextField();
	
	
	private JButton btnSomar = new JButton("Somar");
	private JButton btnSubtrair = new JButton("Subtrair");
	private JButton btnMultiplicar = new JButton("Multiplicar");
	private JButton btnDividir = new JButton("Dividir");
	
	
	// METODO PRINCIPAL PARA EXECUÇÃO
	public static void main(String[] args) {
		new VisaoCalculadora().setVisible(true);
	}
	
	public VisaoCalculadora() {
		setTitle("Calculadora");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// CAIXAS DE TEXTO
		txtPrimeiroNumero.setBounds(200, 180, 50, 40);
		objPainel.add(txtPrimeiroNumero);
		txtSegundoNumero.setBounds(350, 180, 50, 40);
		objPainel.add(txtSegundoNumero);
		txtResultado.setBounds(500, 180, 50, 40);
		objPainel.add(txtResultado);
		
		// LABELS
		lblInterrogação.setBounds(300, 180, 50, 40);
		objPainel.add(lblInterrogação);
		lblIgual.setBounds(450, 180, 50, 40);
		objPainel.add(lblIgual);
		
		// BOTAO
		
		btnSomar.setBounds(175, 350, 100, 35);
		objPainel.add(btnSomar);
		btnSomar.addActionListener(new ControladorSomar(txtPrimeiroNumero, txtSegundoNumero, txtResultado));
		btnSubtrair.setBounds(275, 350, 100, 35);
		objPainel.add(btnSubtrair);
		btnSubtrair.addActionListener(new ControladorSubtrair(txtPrimeiroNumero, txtSegundoNumero, txtResultado));
		btnMultiplicar.setBounds(375, 350, 100, 35);
		objPainel.add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ControladorMultiplicar(txtPrimeiroNumero, txtSegundoNumero, txtResultado));
		btnDividir.setBounds(475, 350, 100, 35);
		btnDividir.addActionListener(new ControladorDividir(txtPrimeiroNumero, txtSegundoNumero, txtResultado));
		objPainel.add(btnDividir);
	}
	
	

}
