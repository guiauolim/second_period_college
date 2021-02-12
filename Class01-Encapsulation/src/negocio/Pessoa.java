package negocio;

public class Pessoa {
	// Propriedade da classe
	private String nome = "";
	private String endereco = "";
	private int telefone = 0;
	
	// Metodos construtores da classe
	// Metodo contrutor vazio
	public Pessoa() {
		
	}
	//Metodo construtor cheio
	public Pessoa (String nome, String endereco, int telefone ) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	// Metodos get/ set
	public String getNome () {
		return nome;
	}
	public void setNome (String nome ) {
		this.nome = nome;
	}
	public String getEndereco () {
		return endereco;
    }
	public void setEndereco (String endereco ) {
		this.endereco = endereco;
    }
	public int getTelefone () {
		return telefone;
    }
	public void setTelefone (int telefone ) {
		this.telefone = telefone;
    }
}