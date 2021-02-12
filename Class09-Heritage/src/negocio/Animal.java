package negocio;

public abstract class Animal {
	
	// Propriedadee da classe
	private double peso = 0;
	private double altura = 0;
	private String nome = "";
	
	// metodos construtores
	public Animal() {
		super();
	}
	public Animal(double peso, double altura, String nome) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.nome = nome;
	}
	
	// metodos gets/sets
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// metodo da classe
	public double calcularImc () {
		double calculo = 0;
		calculo = (getAltura() / Math.pow(getPeso(), 2));
		return calculo;
	}

}
