package apresentacao;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VisaoPrincipal extends JFrame {
	// PROPRIEDADES
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblCores = new JLabel("Cores");
	private JComboBox<String> cboCores = new JComboBox<String>(); 
	
	private JCheckBox cbkAtendimentoEpecial = new JCheckBox("Atendimento Especial");
	private JCheckBox cbkArCondicionado = new JCheckBox("Ar Condicionado");
	
	private JLabel lblPeriodo = new JLabel("Periodo de Avaliação");
	private ButtonGroup grpPeriodo = new ButtonGroup();
	private JRadioButton optManha = new JRadioButton("Manhã");
	private JRadioButton optTarde = new JRadioButton("Tarde");
	private JRadioButton optNoite = new JRadioButton("Noite");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// MÉTODO PRINCIPAL 
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	// MÉTODO CONSTRUTOR
	
	 public VisaoPrincipal() {
	// CONFIGURAÇÃO DA JANELA	 
		 setTitle(" Janela de Teste de Controles");
		 setSize(800,600);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setLocationRelativeTo(null);
		 setBackground(Color.LIGHT_GRAY);
		 
	// CONFIGURAÇÃO DO PAINEL
		 objPainel.setLayout(null);
		 setContentPane(objPainel);
		 
	// COMBOBOX
		 lblCores.setBounds(30, 30, 200, 20);
		 objPainel.add(lblCores);
		 cboCores.setBounds(30, 50, 200, 20);
		 objPainel.add(cboCores);
		 
		 cboCores.addItem("");
		 cboCores.addItem("Amarelo");
		 cboCores.addItem("Azul");
		 cboCores.addItem("Branco");
		 cboCores.addItem("Cinza");
		 cboCores.addItem("Preto");
		 cboCores.addItem("Verde");
		 cboCores.addItem("Vermelho");
		 
	// CHECKBOX
		 cbkAtendimentoEpecial.setBounds(30, 100, 200, 20);
		 objPainel.add(cbkAtendimentoEpecial);
		 
		 cbkArCondicionado.setBounds(30, 130, 200, 20);
		 objPainel.add(cbkArCondicionado);
		 
	
	// RadioButton	 
		 lblPeriodo.setBounds(30, 160, 200, 20);
		 objPainel.add(lblPeriodo);
		 optManha.setBounds(28, 180, 200, 20);
		 objPainel.add(optManha);
		 optTarde.setBounds(28, 200, 200, 20);
		 objPainel.add(optTarde);
		 optNoite.setBounds(28, 220, 200, 20);
		 objPainel.add(optNoite);
		 
		 grpPeriodo.add(optManha);
		 grpPeriodo.add(optTarde);
		 grpPeriodo.add(optNoite);
		 optManha.setSelected(true);
		 
		 
	// BOTÕES DE AÇÃO 
		 btnGravar.setBounds(450, 500, 100, 30);
		 objPainel.add(btnGravar);
		 btnGravar.addActionListener(new ControladorGravar(cboCores, cbkAtendimentoEpecial, cbkArCondicionado, optManha, optTarde));
		 btnLimpar.setBounds(550, 500, 100, 30);
		 objPainel.add(btnLimpar);
		 btnLimpar.addActionListener(new ControladorLimpar(cboCores, cbkAtendimentoEpecial, cbkArCondicionado, optManha, optTarde));
		 btnSair.setBounds(650, 500, 100, 30);
		 btnSair.addActionListener(new ControladorSair());
		 objPainel.add(btnSair);
		 
		 
		 

		 
	 }
	 
	

}
