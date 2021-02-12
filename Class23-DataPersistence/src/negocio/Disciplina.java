package negocio;

import java.util.Collection;

import persistencia.DisciplinaDAO;

public class Disciplina extends Entidade {
	// PROPRIEDADES DA CLASSE
	private String nome = "";

	
	
	// METODOS CONSTRUTORES DA CLASSE
	public Disciplina() {
		super();
	}

	public Disciplina(int id, String nome) {
		super(id);
		this.nome = nome;
	}

	
	// METODOS GETS SETS 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// METODOS DA CLASSE
	public static Collection<Disciplina> recuperarTodos () throws Exception {
		return new DisciplinaDAO().recuperarTodos();		
	}

	

}
