package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import apresentacaoFolhaPagamento.VisaoFolhaPagamento;

public class ControladorFolhaPagamento implements ActionListener {
	// PROPRIEDADES DA CLASSE
	private JDesktopPane objContainer = null;

	// METODO CONSTRUTOR CHEIO
	public ControladorFolhaPagamento(JDesktopPane objContainer) {
		super();
		this.objContainer = objContainer;
	}



	public void actionPerformed(ActionEvent e) {
		VisaoFolhaPagamento objJanela = new VisaoFolhaPagamento();
		objJanela.setVisible(true);
		objContainer.add(objJanela);

	}

}
