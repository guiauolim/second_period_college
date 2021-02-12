package negocio;

public class ClassificacaoCampeonato {
	private Time objTime = null;
	
	// METODOS CONSTRUTORES
	private int qtdPontos = 0;
	public ClassificacaoCampeonato() {
		super();
	}
	public ClassificacaoCampeonato(Time objTime, int qtdPontos) {
		super();
		this.objTime = objTime;
		this.qtdPontos = qtdPontos;
	}
	
	// METODOS GETS/SETS
	public Time getObjTime() {
		return objTime;
	}
	public void setObjTime(Time objTime) {
		this.objTime = objTime;
	}
	public int getQtdPontos() {
		return qtdPontos;
	}
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	
	public void somaQtdPontos (int qtdPontos) {
		this.qtdPontos += qtdPontos;
	}
	
	

}
