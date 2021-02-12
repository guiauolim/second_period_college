package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import apresentacao.Resultado.VisaoResultado;
import negocio.Pessoa;



public class ControladorCadastrar implements ActionListener {

	private JDesktopPane objContainer = null;
	private JTextField txtNome = null;
	private JTextField txtProfissao = null;
	private JTextField txtAno = null;
	private JTextField txtAltura = null;


	
	
	// METODO CONSTRUTOR
	public ControladorCadastrar(JDesktopPane objContainer, JTextField txtNome, JTextField txtProfissao,
			JTextField txtAno, JTextField txtAltura) {
		super();
		this.objContainer = objContainer;
		this.txtNome = txtNome;
		this.txtProfissao = txtProfissao;
		this.txtAno = txtAno;
		this.txtAltura = txtAltura;
		
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		
		
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Nome' obrigatório!");
			return;
		}
		if (txtProfissao.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Profissão' obrigatório!");
			return;
		}
		if (txtAno.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Ano' obrigatório!");
			return;
		}
		if (txtAltura.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo 'Altura' obrigatório!");
			return;
		}
		
		
		
	//	JOptionPane.showMessageDialog(null, new ControladorCadastrar(objContainer, txtNome, txtProfissao, txtAno, txtAltura).recuperar());
			
				
		// METODO PARA ABRIR JANELA
		VisaoResultado objJanela = new VisaoResultado();
		objJanela.setVisible(true);
		objContainer.add(objJanela);
		
	
		
		
	}
	
	public String recuperar() {
		Pessoa objPessoa = new Pessoa();
		ControladorCadastrar objC = new ControladorCadastrar(objContainer, txtNome, txtProfissao, txtAno, txtAltura);
		String retorno = "";
		
		
		objPessoa.setNome(objC.txtNome.getText());
		retorno = "Nome: " + objPessoa.getNome();
		
		
		
		return retorno;	
	}

	
	
	
	
	
	}



	 
	
		
	


