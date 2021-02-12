package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import apresentacao.cargo.VisaoCargo;

public class ControladorCargo implements ActionListener {
	// PROPRIEDADES DA CLASSE
	private JDesktopPane objContainer = null;

	// METODO CONSTRUTOR CHEIO
	public ControladorCargo(JDesktopPane objContainer) {
		super();
		this.objContainer = objContainer;
	}



	public void actionPerformed(ActionEvent e) {
		VisaoCargo objJanela = new VisaoCargo();
		objJanela.setVisible(true);
		objContainer.add(objJanela);

	}

}
