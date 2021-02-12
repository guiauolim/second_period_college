package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;



public class VisaoTurma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel objPainel = new JPanel();
	
	private JLabel lblDisciplina = new JLabel("Disciplina");
	private JComboBox<String> cboDisciplina = new JComboBox<String>();
	
	private JLabel lblProfessor = new JLabel("Professor");
	private JComboBox<String> cboProfessor = new JComboBox<String>();
	
	private JLabel lblLetra = new JLabel("Turma:");
	private JTextField txtLetra = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	public static void main(String[] args) {
		new VisaoTurma().setVisible(true);
	}
	
	// METODO CONSTRUTOR DA JANELA
	public VisaoTurma() {
		// CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de Turmas");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		// CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// DISCIPLINA
		lblDisciplina.setBounds(30, 30, 200, 20);
		objPainel.add(lblDisciplina);
		cboDisciplina.setBounds(27, 50, 200, 20);
		objPainel.add(cboDisciplina);
		cboDisciplina.addItem("");
		try {
			for (Disciplina objDisciplina : Disciplina.recuperarTodos() ) {
				cboDisciplina.addItem(objDisciplina.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		
		// PROFESSOR
		lblProfessor.setBounds(30, 100, 200, 20);
		objPainel.add(lblProfessor);
		cboProfessor.setBounds(27, 120, 200, 20);
		objPainel.add(cboProfessor);
		cboProfessor.addItem("");
		try {
			for (Professor objProfessor: Professor.recuperarTodos() ) {
				cboProfessor.addItem(objProfessor.getTitulacao() + "   " + objProfessor.getNome());
			}
		} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro);
			}
		
		// lETRA
		lblLetra.setBounds(30, 170, 200, 20);
		objPainel.add(lblLetra);
		txtLetra.setBounds(27, 190, 50, 20);
		objPainel.add(txtLetra);
		
		// BOTÕES 
		
		btnGravar.setBounds(450, 500, 100, 30);
		objPainel.add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(cboProfessor, cboDisciplina, txtLetra));
		
		
		btnLimpar.setBounds(550, 500, 100, 30);
		objPainel.add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(cboProfessor, cboDisciplina, txtLetra));
		
		btnSair.setBounds(650, 500, 100, 30);
		objPainel.add(btnSair);
		btnSair.addActionListener(new ControladorSair());
				
	}


}
