package negocio;

public class Produto {
	// Propriedades
	private String nome = "";
	private Estante objEstante;
	private int quantidade = 0;
	
	// Construtor vazio
	public Produto () {
		
	}
	// Construtor cheio 
	public Produto (String nome, Estante objEstante, int quantidade) {
		this.nome = nome;
		this.objEstante = objEstante;
		this.quantidade = quantidade;
	}
	// Construtor gets/sets
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public Estante getObjEstante () {
		return objEstante;
	}
	public void setObjEstante ( Estante objEstante) {
		this.objEstante = objEstante;
		
	}
	public int getQuantidade () {
		return quantidade;
	}
	public void setQuantidade (int quantidade ) {
		this.quantidade = quantidade;
	}

}
