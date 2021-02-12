package negocio;

import java.util.Collection;

import persistencia.ClienteDAO;

public class Cliente extends Entidade {
	// PROPRIEDADES DA CLASSE
	private String nome = "";
	private String cartao = "";
	
	// METODOS CONSTRUTORES
	public Cliente() {
		super();
	}
	

	public Cliente(int id, String nome, String cartao) {
		super(id);
		this.nome = nome;
		this.cartao = cartao;
	}

	// mMETODOS GETS/ SETS
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCartao() {
		return cartao;
	}


	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	// METODOS DA CLASSE
	public Collection<Cliente> recuperarTodos () throws Exception {
		return new ClienteDAO().recuperarTodos();
	}
	
	

}
