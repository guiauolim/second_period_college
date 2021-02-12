package negocio;

import persistencia.RodadaDao;

public class Rodada extends Entidade {
	// PROPRIEDADES DA CLASSE
	private int numero = 0;
	
	// METODOS CONSTRUTORES
	public Rodada() {
		super();
	}

	public Rodada(int id, int numero) {
		super(id);
		this.numero = numero;
	}
	
	// METODOS GETS/SETS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// METODOS PARA PERSISITIR
	public void persistir () throws Exception {
		 new RodadaDao().persistir(this);
		
	}

	// METODOS PARA RETORNAR A PROXIMA RODADA
	public static int getProximaRodada () throws Exception {
		return new RodadaDao().getProximaRodada();
	}
	

}
