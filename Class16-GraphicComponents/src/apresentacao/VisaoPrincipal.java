package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VisaoPrincipal extends JFrame {
          // PROPRIEDADES
	private static final long serialVersionUID = 1L;
	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome:");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblEndereco = new JLabel("Endereço: ");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblCurriculo = new JLabel("Currículo: ");
	private JTextArea txtCurriculo = new JTextArea();
	private JScrollPane jscCurriculo = new JScrollPane(txtCurriculo);
	
	private JButton btnSair = new JButton("Sair");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnGravar = new JButton("Gravar");
	
	
	
	
	// METODO PRINCIPAL		
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	// METODO CONSTRUTOR DA CLASSE
	public VisaoPrincipal () {
		// CONFIGURAÇÃO DA JANELA
		setTitle("Janela de Teste de Botões e Caixas de Texto!");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// LABEL E CAIXA DE TEXTO (NOME)
		lblNome.setBounds(30, 30, 300, 30);	
		objPainel.add(lblNome);
		txtNome.setBounds(35, 60, 400, 30);
		objPainel.add(txtNome);
				
	
		
		// LABEL E CAIXA DE TEXTO (ENDEREÇO)
		lblEndereco.setBounds(30, 100, 300, 30);
		objPainel.add(lblEndereco);
		txtEndereco.setBounds(35, 130, 400, 30);
		objPainel.add(txtEndereco);
		
		// LABEL E CAIXA DE TEXTO (CURRICULO)
		lblCurriculo.setBounds(30, 170, 300, 30);
		objPainel.add(lblCurriculo);
		jscCurriculo.setBounds(35, 200, 400, 100);
		objPainel.add(jscCurriculo);
		txtCurriculo.setLineWrap(true);
		
		
	
		// BOTÃO SAIR - CONSTRUTOR VAZIO POIS OS BOTÕES NÃO INTERAGEM COM A TELA
		btnSair.setBounds(650, 500 , 100, 30);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
		
		// BOTÃO LIMPAR - TODA VEZ QUE O CONTROLADOR INTERAGIR COM OS DADOS DA TELA TEM QUE TER CONSTRUTOR CHEIO
		btnLimpar.setBounds(540, 500, 100, 30);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtEndereco, txtCurriculo));
		objPainel.add(btnLimpar);
		
		
		// BOTAO GRAVAR
		btnGravar.setBounds(430, 500, 100, 30);
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtEndereco));
		objPainel.add(btnGravar);
		
		
	}
	

}
