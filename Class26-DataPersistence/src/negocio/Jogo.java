package negocio;


import java.util.ArrayList;
import java.util.Collection;



import persistencia.JogoDAO;

public class Jogo extends Entidade {
	// PROPRIEDADES
	private Rodada objRodada = null;
	private Time objTime1 = null;
	private Time objTime2 = null;
	private int qtdGolTime1 = 0;
	private int qtdGolTime2 = 0;
	
	// METODOS CONSTRUTORES
	public Jogo() {
		super();
	}

	public Jogo(int id, Rodada objRodada, Time objTime1, Time objTime2, int qtdGolTime1, int qtdGolTime2) {
		super(id);
		this.objRodada = objRodada;
		this.objTime1 = objTime1;
		this.objTime2 = objTime2;
		this.qtdGolTime1 = qtdGolTime1;
		this.qtdGolTime2 = qtdGolTime2;
	}

	// METODOS GETS/SETS
	public Rodada getObjRodada() {
		return objRodada;
	}

	public void setObjRodada(Rodada objRodada) {
		this.objRodada = objRodada;
	}

	public Time getObjTime1() {
		return objTime1;
	}

	public void setObjTime1(Time objTime1) {
		this.objTime1 = objTime1;
	}

	public Time getObjTime2() {
		return objTime2;
	}

	public void setObjTime2(Time objTime2) {
		this.objTime2 = objTime2;
	}

	public int getQtdGolTime1() {
		return qtdGolTime1;
	}

	public void setQtdGolTime1(int qtdGolTime1) {
		this.qtdGolTime1 = qtdGolTime1;
	}

	public int getQtdGolTime2() {
		return qtdGolTime2;
	}

	public void setQtdGolTime2(int qtdGolTime2) {
		this.qtdGolTime2 = qtdGolTime2;
	}
	// METODOS DA CLASSE
	public static Collection<Jogo> recuperarTodos () throws Exception {
		return new JogoDAO().recuperarTodos();
	}
	
	// METODO DA CLASSE
	public void persistir () throws Exception {
		new JogoDAO().persistir(this);
	}

	
	public static String recuperarClassificacao() throws Exception {
		String retorno = "";
		
		ArrayList<ClassificacaoCampeonato> colecaoClassificacao = new ArrayList<ClassificacaoCampeonato>();
		
		// INSERIR TODOS OS TIMES NA CLASSFICACAO
		
		for (Time objTime : Time.recuperarTodos()) {
			colecaoClassificacao.add(new ClassificacaoCampeonato(objTime, 0));
		}
		// VERIFICAÇÃO DOS RESULTADOS DOS JOGOS
		for (Jogo objJogo : Jogo.recuperarTodos()) {
			int indiceTime1 = encontrarIndiceDoTime(colecaoClassificacao, objJogo.getObjTime1());
			 int indiceTime2 = encontrarIndiceDoTime(colecaoClassificacao, objJogo.getObjTime2());

			
			 if (objJogo.getQtdGolTime1() > objJogo.getQtdGolTime2()) { 
				 // TIME 1 GANHOU O JOGO
				 colecaoClassificacao.get(indiceTime1).somaQtdPontos(3);
			 } else if (objJogo.getQtdGolTime2() > objJogo.getQtdGolTime1()) {
				 // TIME 2 GANHOU
				 colecaoClassificacao.get(indiceTime2).somaQtdPontos(3);
			 } else {
				 // JOGO TERMINOU EMPATE
				 colecaoClassificacao.get(indiceTime1).somaQtdPontos(1);
				 colecaoClassificacao.get(indiceTime2).somaQtdPontos(1);
			 }
		
		}
		
		// ORDENAÇÃO DECRESCENTE PELA PONTUAÇÕ DO TIME
		for (int i = 0 ; i < colecaoClassificacao.size() - 1 ; i++ ) {
			for (int j = (i + 1); j < colecaoClassificacao.size() ; j++) {
				if (colecaoClassificacao.get(i).getQtdPontos() < colecaoClassificacao.get(j).getQtdPontos()) {
				ClassificacaoCampeonato temp = colecaoClassificacao.get(i);
				colecaoClassificacao.set(i, colecaoClassificacao.get(j));
				colecaoClassificacao.set(j, temp);
			}
		}
	}		
	    
		// PREENCHIMENTO DA VARIAVEL DE RETORNO
		for (ClassificacaoCampeonato temp : colecaoClassificacao) {
		retorno += (temp.getQtdPontos() + "\t" + temp.getObjTime().getNome() + "\r\n");	
		}
	 
		return retorno;
	
	}
	private static int encontrarIndiceDoTime(ArrayList<ClassificacaoCampeonato> colecao , Time objTime) throws Exception {
		int retorno = -1;
		
		for (int i = 0 ; i < colecao.size() ; i++) {
			if (colecao.get(i).getObjTime().getId() == objTime.getId()) {
				retorno = i;
			}
		}
		
		
		return retorno; 
	}
}	

