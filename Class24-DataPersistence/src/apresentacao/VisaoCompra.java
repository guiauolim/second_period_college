package apresentacao;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Cliente;
import negocio.Produto;

public class VisaoCompra extends JFrame {
	// PROPRIEDADES
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblProduto = new JLabel("Produto");
	private JComboBox<String> cboProduto = new JComboBox<String>();
	
	private JLabel lblCliente = new JLabel("Cliente");
	private JComboBox<String> cboCliente= new JComboBox<String>();
	
	private JLabel lblData = new JLabel("Data");
	private JTextField txtData = new JTextField();
	
	private JLabel lblQuantidade = new JLabel("Quantidade");
	private JTextField txtQuantidade = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	

	
	// METODO PRINCIPAL
	public static void main(String[] args) {
		new VisaoCompra().setVisible(true);
	}
	
	// METODO CONSTRUTOR VAZIO
	public VisaoCompra () {
		// CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de Compras");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		
		// PRODUTO
		lblProduto.setBounds(30, 30, 200, 20);	
		objPainel.add(lblProduto);
		cboProduto.setBounds(27, 50, 300, 30);
		objPainel.add(cboProduto);
		cboProduto.addItem("");
		
		try {
			for (Produto objProduto : new Produto().recuperarTodos()) {
				cboProduto.addItem(objProduto.getNome() + " (R$ " + objProduto.getPreco() + ")" );
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// CLIENTE
		lblCliente.setBounds(30, 100, 200, 20);	
		objPainel.add(lblCliente);
		cboCliente.setBounds(27, 120, 300, 30);
		objPainel.add(cboCliente);
		cboCliente.addItem("");
		
		try {
			for (Cliente objCliente : new Cliente().recuperarTodos()) {
				cboCliente.addItem(objCliente.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// DATA
		lblData.setBounds(30, 170, 200, 20);	
		objPainel.add(lblData);
		txtData.setBounds(27, 190, 100, 20);
		objPainel.add(txtData);
		
		// QUANTIDADE
		lblQuantidade.setBounds(30, 230, 200, 20);	
		objPainel.add(lblQuantidade);
		txtQuantidade.setBounds(27, 250, 50, 20);
		objPainel.add(txtQuantidade);
		
		// BOTÕES
		btnGravar.setBounds(450, 500, 100, 30);
		objPainel.add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(cboProduto, cboCliente, txtData, txtQuantidade));
		
		btnLimpar.setBounds(550, 500, 100, 30);
		objPainel.add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(cboProduto, cboCliente, txtData, txtQuantidade));
		
		btnSair.setBounds(650, 500, 100, 30);
		objPainel.add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
	

}
