package negocio;

public class Fabricante {
	//propriedades
	private String nome = "";
	
	
	// metodos construtores

	public Fabricante() {
		super();
	}

	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	
	// metodos gets/sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
