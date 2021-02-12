package negocio;

import java.util.Collection;

import persistencia.ProfessorDAO;

public class Professor extends Entidade {
	
	// PROPRIEDADES DA CLASSE
	private String nome = "";
	private String titulacao = "";
	
	// METODOS CONTRUTORES
	public Professor() {
		super();
	}
	public Professor(int id,String nome, String titulacao) {
		super(id);
		this.nome = nome;
		this.titulacao = titulacao;
	}
	
	// METODOS GETS SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	// METODOS DA CLASSE
	public static Collection<Professor> recuperarTodos () throws Exception {
		return new ProfessorDAO().recuperarTodos();
	}
	
	

}
