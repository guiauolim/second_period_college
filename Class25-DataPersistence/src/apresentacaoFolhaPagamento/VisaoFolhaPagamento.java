package apresentacaoFolhaPagamento;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import apresentacao.ControladorFechar;

public class VisaoFolhaPagamento extends JInternalFrame {
	// PRPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblResultado = new JLabel("Resultado");
	private JTextArea txtResultado= new JTextArea();
	private JScrollPane jspResultado = new JScrollPane(txtResultado);
	
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnFechar = new JButton("Fechar");
	
	
	public VisaoFolhaPagamento() {
		// CONFIGURAÇÃO DA JANELA
		super("Folha de Pagamento", false, true, true, true );
		setSize(750,550);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// RESULTADO
		lblResultado.setBounds(30, 30, 200, 20);
		objPainel.add(lblResultado);
		jspResultado.setBounds(27, 50, 670, 300);
		objPainel.add(jspResultado);
		
				
		// BOTÕES
		btnCalcular.setBounds(450, 450, 100, 30);
		objPainel.add(btnCalcular);
		btnCalcular.addActionListener(new ControladorCalcular(txtResultado));
		btnLimpar.setBounds(550, 450, 100, 30);
		objPainel.add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtResultado));
		btnFechar.setBounds(650, 450, 100, 30);
		objPainel.add(btnFechar);
		btnFechar.addActionListener(new ControladorFechar(this));
		
		
	}
}	
		
		
		
		