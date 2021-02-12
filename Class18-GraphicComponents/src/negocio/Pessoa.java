package negocio;

public class Pessoa {
	
	// PROPRIEDADES
	private String nome = "";
	private boolean sexo = false;
	private String endereco = "";
	private Uf objUf;
	
	
	// METODO CONSTRUTOR VAZIO
	public Pessoa() {
		super();
	} 
	
	// METODO CONSTRUTOR CHEIO
	public Pessoa(String nome, boolean sexo, String endereco, Uf objUf) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.objUf = objUf;
	}
	
	
	
	// METODO GETS\SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Uf getObjUf() {
		return objUf;
	}
	public void setObjUf(Uf objUf) {
		this.objUf = objUf;
	}
	
	
	

}
