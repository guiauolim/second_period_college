package negocio;

import java.util.Collection;

import persistencia.ProdutoDAO;

public class Produto extends Entidade {
	// PROPRIEDADES DA CLASSE
	private  String nome = "";
	private  double preco = 0;
	
	
	// MÉTODOS CONSTRUTORES
	public Produto() {
		super();
	}
	public Produto(int id, String nome, double preco) {
		super(id);
		this.nome = nome;
		this.preco = preco;
	}

	// MÉTODOS GETS/SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// METODOS DA CLASSE 
	public  Collection<Produto> recuperarTodos () throws Exception {
		return new ProdutoDAO().recuperarTodos();
	}
	
	

}
