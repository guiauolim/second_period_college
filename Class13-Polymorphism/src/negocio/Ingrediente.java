package negocio;

public class Ingrediente {
	// propriedades
	private String nome = "";
	private double quantidade = 0;
	private String unidade = "";
	
	// metodos construtores
	
	public Ingrediente() {
		super();
	}
	public Ingrediente(String nome, double quantidade, String unidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.unidade = unidade;
	}
	
	//metodos gets/sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	

}
