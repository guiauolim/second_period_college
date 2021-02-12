package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPrincipal extends JFrame {
	// PROPRIEDADES
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome:");
	private JTextField txtNome = new JTextField();
	
    private JRadioButton optMasculino = new JRadioButton("Masculino");
    private JRadioButton optFeminino = new JRadioButton("Feminino");
	private ButtonGroup grpSexo = new ButtonGroup();
	
	private JLabel lblEndereco= new JLabel("Endereço:");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblUf = new JLabel("Escolha a UF:");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar= new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// METODO PRINCIPAL
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	// CONFIGURAÇÃO DA JANELA
	public VisaoPrincipal() {
	setTitle("Cadastro de Pessoas");
	setSize(800,600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	// CONFIGURAÇÃO DO PAINEL
	objPainel.setLayout(null);
	setContentPane(objPainel);
	
	// NOME
	lblNome.setBounds(50, 70, 400, 10);
	objPainel.add(lblNome);
	txtNome.setBounds(50, 90, 400, 25);
	objPainel.add(txtNome);
	
	// SEXO
	optMasculino.setBounds(50, 140, 400, 25);
	objPainel.add(optMasculino);
	grpSexo.add(optMasculino);
	optFeminino.setBounds(50, 160, 400, 25);
	objPainel.add(optFeminino);
	grpSexo.add(optFeminino);
	optMasculino.setSelected(true);	
	
	// ENDEREÇO
	lblEndereco.setBounds(50, 200, 400, 10);
	objPainel.add(lblEndereco);
	txtEndereco.setBounds(50, 220, 400, 25);
	objPainel.add(txtEndereco);
	
	// UF
	lblUf.setBounds(50, 275, 400, 10);
	objPainel.add(lblUf);
	cboUf.setBounds(50, 295, 100, 25);
	objPainel.add(cboUf);
	cboUf.addItem("");
	for (Uf objUf : Uf.recuperarTodos()) {
		cboUf.addItem(objUf.getSigla());
	}
	
	// BOTÕES
	 btnGravar.setBounds(450, 500, 100, 30);
	 objPainel.add(btnGravar);
	 btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, txtEndereco, cboUf));
	 btnLimpar.setBounds(550, 500, 100, 30);
	 objPainel.add(btnLimpar);
	 btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, cboUf));
	 btnSair.setBounds(650, 500, 100, 30);
	 btnSair.addActionListener(new ControladorSair());
	 objPainel.add(btnSair);
	
}
}