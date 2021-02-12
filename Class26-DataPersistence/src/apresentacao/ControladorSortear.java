package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import negocio.Jogo;
import negocio.Rodada;
import negocio.Time;


public class ControladorSortear implements ActionListener {

	
	
	private JTextArea txtAreaJogo = null;
	private JTextArea txtAreaClassificacao = null;
	private ArrayList<Jogo> colecaoDeJogosDaRodada = null;

	
	
	// METODO CONSTRUTOR

	public ControladorSortear(JTextArea txtAreaJogo, JTextArea txtAreaClassificacao, ArrayList<Jogo> colecaoDeJogosDaRodada) {
		super();
		this.txtAreaJogo = txtAreaJogo;
		this.txtAreaClassificacao = txtAreaClassificacao;
		this.colecaoDeJogosDaRodada = colecaoDeJogosDaRodada;

	}




	// METODOS DA CLASSE
	public void actionPerformed(ActionEvent e) {
		
		colecaoDeJogosDaRodada.clear();
		txtAreaJogo.setText("");
		
		
		
		try {	
		
		HashSet<Integer> colecaoDeIndicesSortados = new HashSet<Integer>();
		
		ArrayList<Time> colecaoDeTimes = (ArrayList<Time>) Time.recuperarTodos();
		
		Rodada objRodada = new Rodada(0, Rodada.getProximaRodada());
		objRodada.persistir();
		
		
		for (int i = 0; i < (colecaoDeTimes.size() / 2) ; i++) {
			
			int time = 0;
				
			Jogo objJogo = new Jogo();
			// SORTEIO DO TIME 1
			do {
				time = (int) (colecaoDeTimes.size() * Math.random());
			} while (colecaoDeIndicesSortados.contains(time));
			objJogo.setObjTime1(colecaoDeTimes.get(time));
			colecaoDeIndicesSortados.add(time);
			
			// SORTEIO DO TIME 2
			do {
				time = (int) (colecaoDeTimes.size() * Math.random());
			} while (colecaoDeIndicesSortados.contains(time));
			objJogo.setObjTime2(colecaoDeTimes.get(time));
			colecaoDeIndicesSortados.add(time);
			
			// DEFINIÇÃO DA RODADA
			objJogo.setObjRodada(objRodada);
			// DEFINIÇÃO DOS GOLS
			objJogo.setQtdGolTime1((int) (5 * Math.random()));
			objJogo.setQtdGolTime2((int) (5 * Math.random()));
			
			colecaoDeJogosDaRodada.add(objJogo);
			}
		
			txtAreaJogo.setText("Número da Rodada: " + colecaoDeJogosDaRodada.get(0).getObjRodada().getNumero() + "\r\n\r\n");
			
		
		
			
		for (Jogo objJogo : colecaoDeJogosDaRodada) {
			txtAreaJogo.append(objJogo.getObjTime1().getNome() + "\t" + objJogo.getQtdGolTime1() + " x " + objJogo.getQtdGolTime2() + "\t" +
					           objJogo.getObjTime2().getNome() + "\r\n");
			
			objJogo.persistir();
		  }
		txtAreaClassificacao.setText(Jogo.recuperarClassificacao());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}

}
