package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
	// PROPRIEDADES
	private String sigla = "";
    // METODO CONSTRUTOR VAZIO
	public Uf() {
		super();
	}
    // METODO CONSTRUTOR CHEIO
	public Uf(String sigla) {
		super();
		this.sigla = sigla;
	}
	
    // METODOS GETS SETS
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	// METODO IMPLEMENTADOS DA CLASSE
	public static Collection<Uf> recuperarTodos() {
		ArrayList<Uf> retorno = new ArrayList<Uf>();
		
		retorno.add(new Uf("AC"));
		retorno.add(new Uf("AP"));
		retorno.add(new Uf("BA"));
		retorno.add(new Uf("CE"));
		retorno.add(new Uf("DF"));
		retorno.add(new Uf("ES"));
		retorno.add(new Uf("GO"));
		retorno.add(new Uf("MG"));
		retorno.add(new Uf("MS"));
		retorno.add(new Uf("MT"));
		retorno.add(new Uf("PA"));
		retorno.add(new Uf("PI"));
		retorno.add(new Uf("PR"));
		retorno.add(new Uf("RJ"));
		retorno.add(new Uf("RS"));
		retorno.add(new Uf("SC"));
		retorno.add(new Uf("SP"));
		retorno.add(new Uf("TO"));
		
		
		return retorno;
		
	}

}
