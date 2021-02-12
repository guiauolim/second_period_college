package apresentacao;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import negocio.Jogo;

public class VisaoCampeonatoBrasileiro extends JFrame {
	// PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblJogo = new JLabel("Jogos da Rodada:");
	private JTextArea txtAreaJogo = new JTextArea();
	private JScrollPane jspAreaJogo = new JScrollPane(txtAreaJogo);
	
	private JLabel lblClassificacao = new JLabel("Classificação do Campeonato:");
	private JTextArea txtAreaClassificacao = new JTextArea();
	private JScrollPane jspAreaClassificacao = new JScrollPane(txtAreaClassificacao);
	
	private JButton btnSortear = new JButton("Sortear Jogos");
	private JButton btnSair = new JButton("Sair");
	
	private ArrayList<Jogo> colecaoDeJogosDaRodada = new ArrayList<Jogo>();
	
	// METODO PRINCIPAL DE EXECUCAO
	public static void main(String[] args) {
		new VisaoCampeonatoBrasileiro().setVisible(true);
	}
	
	// METODO CONSTRUTOR
	public VisaoCampeonatoBrasileiro() {
		// 	CONFIGURAR JANELA
		setTitle("Campeonato Brasileiro 2020");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAR O PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// JOGO
		lblJogo.setBounds(30, 30, 200, 20);
		objPainel.add(lblJogo);
		jspAreaJogo.setBounds(27, 50, 350, 250);
		objPainel.add(jspAreaJogo);
		
		// CLASSIFICAÇÃO
		lblClassificacao.setBounds(400, 30, 200, 20);
		objPainel.add(lblClassificacao);
		jspAreaClassificacao.setBounds(397, 50, 353, 350);
		objPainel.add(jspAreaClassificacao);
		try {
		txtAreaClassificacao.setText(Jogo.recuperarClassificacao());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// BOTÕES
		btnSortear.setBounds(150, 500, 200, 30);
		objPainel.add(btnSortear);
		btnSortear.addActionListener(new ControladorSortear(txtAreaJogo, txtAreaClassificacao, colecaoDeJogosDaRodada));
		

		
		btnSair.setBounds(550, 500, 200, 30);
		objPainel.add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
