package negocio;

import java.util.Collection;

import persistencia.AutorDAO;

public class Autor {
	//PROPRIEDADES
	private int id = 0;
	private String nome = "";
	
	// METODOS CONSTRUTORES
	public Autor() {
		super();
	}
	public Autor(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		
		// METODOS GETS/SETS
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// METODOS DA CLASSE
	public static Collection<Autor> recuperarTodos () throws Exception {
		return new AutorDAO().recuperarTodos();
	}

}
