package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {
	// PROPRIEDADES
	private String descricao = "";
	
	
	// METODO CONSTRUTOR VAZIO
	public Tipo() {
		super();
	}

	// METODO CONSTRUTOR CHEIO
	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	
	// METODO GETS/SETS
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// METODOS DA CLASSE 
	public static Collection<Tipo> recuperarTodos() {
		ArrayList<Tipo> retorno = new ArrayList<Tipo>();
		
		retorno.add(new Tipo(""));
		retorno.add(new Tipo("Eletro-Eletrônico"));
		retorno.add(new Tipo("Alimentício"));
		retorno.add(new Tipo("Cosmético"));
		retorno.add(new Tipo("Vestuário"));
		retorno.add(new Tipo("Multímídia"));
		
		
		return retorno;
	}
	
	

}
