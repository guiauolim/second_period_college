package negocio;

import java.util.Collection;

import persistencia.TimeDAO;

public class Time extends Entidade {
	// PROPRIEDADES DA CLASSE
	private String nome = "";

	
	// METODOS CONSTRUTORES
	public Time() {
		super();
	}

	public Time(int id, String nome) {
		super(id);
		this.nome = nome;
	}

	
	// METODOS GETS/SETS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// METODO PARA PEGAR O TIME(DADOS) DO BANCO 
	public static Collection<Time> recuperarTodos() throws Exception {
		return new TimeDAO().recuperarTodos();
	}
		
	
		
	

}
