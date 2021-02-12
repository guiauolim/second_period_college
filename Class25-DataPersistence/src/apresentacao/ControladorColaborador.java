package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import apresentacaoColaborador.VisaoColaborador;

public class ControladorColaborador implements ActionListener {
	// PROPRIEDADES DA CLASSE
	private JDesktopPane objContainer = null;

	// METODO CONSTRUTOR CHEIO
	public ControladorColaborador(JDesktopPane objContainer) {
		super();
		this.objContainer = objContainer;
	}



	public void actionPerformed(ActionEvent e) {
		VisaoColaborador objJanela = new VisaoColaborador();
		objJanela.setVisible(true);
		objContainer.add(objJanela);

	}

}
