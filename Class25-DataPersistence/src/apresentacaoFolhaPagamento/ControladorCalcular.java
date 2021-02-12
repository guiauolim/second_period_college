package apresentacaoFolhaPagamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import negocio.Colaborador;



public class ControladorCalcular implements ActionListener {
     	// PROPRIEDADES DA CLASSE
	private JTextArea txtResultado = null;
	
	
	// METODOS CONSTRUTORES
	public ControladorCalcular(JTextArea txtResultado) {
		super();
		this.txtResultado = txtResultado;
 
	}
	public void actionPerformed(ActionEvent e) {
		// DECLARAÇÃO DE VARIAVEIS
		double descontoIR = 0;
		double descontoINSS = 0;
		double salarioLiquido = 0;
		
		try {
			
		txtResultado.setText("Nome\t\tSalário Bruto\t\tSalário Liquído\r\n\r\n");
		for (Colaborador objColaborador : Colaborador.recuperarTodos()) {
			// CALCULO
			descontoINSS = (objColaborador.getObjCargo().getSalario() * 0.11);
			
			if (objColaborador.getObjCargo().getSalario() < 1000) {
				descontoIR = 0;
			} else if (objColaborador.getObjCargo().getSalario() < 5000) {
				descontoIR = (objColaborador.getObjCargo().getSalario() * 0.07);
			} else if (objColaborador.getObjCargo().getSalario() < 10000) {
				descontoIR = (objColaborador.getObjCargo().getSalario() * 0.15);
			} else {
				descontoIR = (objColaborador.getObjCargo().getSalario() * 0.275);
			}
			
			salarioLiquido = (objColaborador.getObjCargo().getSalario() - descontoIR - descontoINSS);
			// IMPRESSAO DOS RESULTADOS
			txtResultado.append(objColaborador.getNome() + "\t\t" + objColaborador.getObjCargo().getSalario() + "\t\t" + salarioLiquido);
		} 
 		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
			}
}
