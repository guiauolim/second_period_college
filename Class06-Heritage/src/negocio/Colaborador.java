package negocio;

public class Colaborador {
	// propriedades da classe
	private String matricula = "";
	private String nome = "";
	private double salario = 0;
	
	// metodos construtores
	
	public Colaborador() {
		super();
	}
	
	public Colaborador(String matricula, String nome, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	// metodos gets/sets

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
