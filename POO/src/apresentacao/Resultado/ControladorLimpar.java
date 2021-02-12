package apresentacao.Resultado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
 	// PROPRIEDADES DA CLASSE
private JTextField txtNome = null;
private JTextField txtProfissao = null;
private JTextField txtAno = null;
private JTextField txtAltura = null;

// METODOS CONSTRUTORES
public ControladorLimpar(JTextField txtNome, JTextField txtProfissao, JTextField txtAno, JTextField txtAltura) {
	super();
	this.txtNome = txtNome;
	this.txtProfissao = txtProfissao;
	this.txtAno = txtAno;
	this.txtAltura = txtAltura ;
}
public void actionPerformed(ActionEvent e) {
	txtNome.setText("");
	txtProfissao.setText("");
	txtAno.setText("");
	txtAltura.setText("");

}



}
