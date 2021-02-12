package Negocio;

public class Autor {
	// Propriedades
	private String nome = "";
	
	// construtores 
	public Autor () {
		
	}
	public Autor (String nome) {
		this.nome = nome;
		
	}
	// metodos get/set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
