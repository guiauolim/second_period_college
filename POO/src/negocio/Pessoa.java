package negocio;

public class Pessoa {
	// PROPRIEDADES DA CLASSE
	private String nome = "";
	private int anoNacimento = 0;
	private double altura = 0;
	private String profissao = "";


		
	// METODOS DA CLASSE
	public Pessoa() {
		super();
	}
	
	

	public Pessoa(String nome, int anoNacimento, double altura, String profissao) {
		super();
		this.nome = nome;
		this.anoNacimento = anoNacimento;
		this.altura = altura;
		this.profissao = profissao;
		
		
	}



	// METODOS GETS/SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNacimento() {
		return anoNacimento;
	}
	public void setAnoNacimento(int anoNacimento) {
		this.anoNacimento = anoNacimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
		

		
	}

	
	
	
	

