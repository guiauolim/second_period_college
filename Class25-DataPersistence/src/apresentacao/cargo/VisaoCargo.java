package apresentacao.cargo;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import apresentacao.ControladorFechar;

public class VisaoCargo extends JInternalFrame {
	// PRPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField(); 
	
	private JLabel lblSalario = new JLabel("Salário");
	private JTextField txtSalario = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnFechar = new JButton("Fechar");
	
	
	public VisaoCargo() {
		// CONFIGURAÇÃO DA JANELA
		super("Cadastro de Cargos", false, true, true, true );
		setSize(800,550);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// NOME
		lblNome.setBounds(30, 30, 200, 20);
		objPainel.add(lblNome);
		txtNome.setBounds(27, 50, 200, 20);
		objPainel.add(txtNome);
		
		// SALARIO
		lblSalario.setBounds(30, 90, 200, 20);
		objPainel.add(lblSalario);
		txtSalario.setBounds(30, 110, 100, 20);
		objPainel.add(txtSalario);
		
		// BOTÕES
		btnGravar.setBounds(450, 450, 100, 30);
		objPainel.add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtSalario));
		btnLimpar.setBounds(550, 450, 100, 30);
		objPainel.add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtSalario));
		btnFechar.setBounds(650, 450, 100, 30);
		objPainel.add(btnFechar);
		btnFechar.addActionListener(new ControladorFechar(this));
	}
}
