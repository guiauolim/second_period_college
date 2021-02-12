package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoVeiculo extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblFabricante = new JLabel("Fabricante:");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	private JLabel lblModelo = new JLabel("Modelo:");
	private JTextField txtModelo = new JTextField();
	
	private JLabel lblCor = new JLabel("Cor:");
	private ButtonGroup grpCor = new ButtonGroup();
	private JRadioButton optBranco = new JRadioButton("Branco");
	private JRadioButton optPreto = new JRadioButton("Preto");
	private JRadioButton optCinza = new JRadioButton("Cinza");
	private JRadioButton optAmarelo = new JRadioButton("Amarelo");
	private JRadioButton optVermelho = new JRadioButton("Vermelho");
	private JRadioButton optVerde = new JRadioButton("Verde");
	private JRadioButton optAzul = new JRadioButton("Azul");
	
	private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	
	// METODO PRINCIPAL DE EXECUÇÃO
	public static void main(String[] args) {
		new VisaoVeiculo().setVisible(true);
	}
	
	public VisaoVeiculo() {
	// CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de Veículo");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		
	// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
	
	// FABRICANTE
		lblFabricante.setBounds(50, 70, 400, 30);
		objPainel.add(lblFabricante);
		cboFabricante.setBounds(50, 100, 150, 25);
		objPainel.add(cboFabricante);
		for (Fabricante objFabricante : Fabricante.retornarTodos()) {
			cboFabricante.addItem(objFabricante.getNome());
		}
		
	// MODELO
		lblModelo.setBounds(50, 140, 400, 30);
		objPainel.add(lblModelo);
		txtModelo.setBounds(50, 170, 150, 25);
		objPainel.add(txtModelo);
		
	// COR
		lblCor.setBounds(50, 210, 400, 30);
		objPainel.add(lblCor);
		optBranco.setBounds(50, 230, 400, 30);
		objPainel.add(optBranco);
		optPreto.setBounds(50, 250, 400, 30);
		objPainel.add(optPreto);
		optCinza.setBounds(50, 270, 400, 30);
		objPainel.add(optCinza);
		optAmarelo.setBounds(50, 290, 400, 30);
		objPainel.add(optAmarelo);
		optVermelho.setBounds(50, 310, 400, 30);
		objPainel.add(optVermelho);
		optVerde.setBounds(50, 330, 400, 30);
		objPainel.add(optVerde);
		optAzul.setBounds(50, 350, 400, 30);
		objPainel.add(optAzul);
		
		grpCor.add(optBranco);
		grpCor.add(optPreto);
		grpCor.add(optCinza);
		grpCor.add(optAmarelo);
		grpCor.add(optVermelho);
		grpCor.add(optVerde);
		grpCor.add(optAzul);
		optBranco.setSelected(true);
		
	// TETO SOLAR
		
		chkTetoSolar.setBounds(50, 390, 400, 30);
		objPainel.add(chkTetoSolar);
		
	// BPTÕES
		
		btnGravar.setBounds(450, 500, 100, 30);
		 objPainel.add(btnGravar);
		 btnGravar.addActionListener(new ControladorGravar(cboFabricante, txtModelo, optBranco, optPreto, optCinza, optAmarelo, optVermelho, optVerde, chkTetoSolar));
		 btnLimpar.setBounds(550, 500, 100, 30);
		 objPainel.add(btnLimpar);
		 btnLimpar.addActionListener(new ControladorLimpar(cboFabricante, txtModelo, optBranco, chkTetoSolar));
		 btnSair.setBounds(650, 500, 100, 30);
		 btnSair.addActionListener(new ControladorSair());
		 objPainel.add(btnSair);
		
		
		
	}

}
