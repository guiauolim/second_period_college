package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoCopiar implements ActionListener {
	public void actionPerformed(ActionEvent evento) {
		new JanelaCopiar().setVisible(true);	

	}

}
