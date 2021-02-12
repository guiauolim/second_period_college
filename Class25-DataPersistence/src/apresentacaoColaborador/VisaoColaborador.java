package apresentacaoColaborador;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import apresentacao.ControladorFechar;
import negocio.Cargo;

public class VisaoColaborador extends JInternalFrame {
	// PRPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblCargo = new JLabel("Cargo");
	private JComboBox<String> cboCargo = new JComboBox<String>(); 
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField(); 
	
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnFechar = new JButton("Fechar");
	
	
	public VisaoColaborador() {
		// CONFIGURAÇÃO DA JANELA
		super("Cadastro de Colaboradores", false, true, true, true );
		setSize(800,550);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// CARGO
		lblCargo.setBounds(30, 30, 200, 20);
		objPainel.add(lblCargo);
		cboCargo.setBounds(27, 50, 200, 20);
		objPainel.add(cboCargo);
		cboCargo.addItem("");
		try { 
		for (Cargo objCargo : Cargo.recuperarTodos()) {
			     cboCargo.addItem(objCargo.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// NOME
		lblNome.setBounds(30, 90, 200, 20);
		objPainel.add(lblNome);
		txtNome.setBounds(30, 110, 200, 20);
		objPainel.add(txtNome);
		
		// BOTÕES
		btnGravar.setBounds(450, 450, 100, 30);
		objPainel.add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, cboCargo));
		btnLimpar.setBounds(550, 450, 100, 30);
		objPainel.add(btnLimpar);
		btnFechar.setBounds(650, 450, 100, 30);
		objPainel.add(btnFechar);
		btnFechar.addActionListener(new ControladorFechar(this));
	}
}
