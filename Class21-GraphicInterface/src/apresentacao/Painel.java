package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Painel extends JPanel {
	// Propriedades Da Classe
	private static final long serialVersionUID = 1L;
	
	
	// Métodos subscritos da Classe
	public void paintComponent(Graphics g) {
		// sol
		g.setColor(Color.yellow);
		g.fillOval(600, 20, 150, 150);
		
		// boneco cabeçudo
		// cabeça
		g.setColor(Color.black);
		g.fillOval(600, 350, 50, 50);
		
		g.drawLine(625, 360, 625, 475); // tronco
		g.drawLine(625, 475, 670, 520); // PERNA DIREITA
		g.drawLine(625, 475, 580, 520); // PERNA ESQUERD
		g.drawLine(565, 432, 690, 432); // BRAÇO
		
	
		// CASA
		// FRENTE DA CASA
		
		g.drawRect(50, 300, 150, 200);
		g.drawRect(120, 250, 150, 200);
		//g.drawLine(x1, y1, x2, y2); 
		
		g.drawLine(50, 500, 120, 450); // diagol inferior da esquerda
		g.drawLine(200, 500, 270, 450);// diagol inferior da esquerda
		
		g.drawLine(50, 300, 120, 250);
		g.drawLine(200, 300, 270, 250);
		
	}
	

}
