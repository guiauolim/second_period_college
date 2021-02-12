package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Autor;

public class VisaoLivro extends JFrame{
	//PROPRIEDADES 
	private static final long serialVersionUID = 1L;
	private JPanel objJPanel = new JPanel();
	
	
	private JLabel lblTitulo = new JLabel("Título do livro: ");
	private JTextField txtTitulo = new JTextField();
	
	private JLabel lblAutor = new JLabel("Autor:");
	private JComboBox<String> cboAutor = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// METODO PRINCIPAL
	public static void main(String[] args) {
		new VisaoLivro().setVisible(true);
		
	}
	// METODO DE CONFIGURAÇÃO DA JANELA
	public VisaoLivro () {
		// CONFIGURAÇÃO DA JANELA
		setSize(800,600);
		setTitle("Cadastro de livros");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAÇÃO DO PAINEL
		objJPanel.setLayout(null);
		setContentPane(objJPanel);
		
		// TITULO
		lblTitulo.setBounds(30, 30, 200, 20);
		objJPanel.add(lblTitulo);
		txtTitulo.setBounds(27, 50, 400, 20);
		objJPanel.add(txtTitulo);
		
		
		// AUTOR
		lblAutor.setBounds(30, 90, 200, 20);
		objJPanel.add(lblAutor);
		cboAutor.setBounds(27, 110, 200, 20);
		objJPanel.add(cboAutor);
		cboAutor.addItem("");
		
		try {
			for (Autor objAutor : Autor.recuperarTodos()) {
				cboAutor.addItem(objAutor.getNome());
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro na construção da combo Autor!");
		}
		
		// BOTÕES
		btnGravar.setBounds(450, 500, 100, 30);
		objJPanel.add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtTitulo, cboAutor));
		
		btnLimpar.setBounds(550, 500, 100, 30);
		objJPanel.add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtTitulo, cboAutor));
		
		btnSair.setBounds(650, 500, 100, 30);
		objJPanel.add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		
		
		
	}
	

}
