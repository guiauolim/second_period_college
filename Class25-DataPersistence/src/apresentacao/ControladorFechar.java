package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

public class ControladorFechar implements ActionListener {

	private JInternalFrame objJanela = null;
	
	public ControladorFechar(JInternalFrame objJanela) {
		super();
		this.objJanela = objJanela;
	}

	public void actionPerformed(ActionEvent arg0) {
		objJanela.setVisible(false);
		

	}

}
