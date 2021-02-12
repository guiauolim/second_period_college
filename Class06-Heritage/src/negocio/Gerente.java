package negocio;

public class Gerente extends Colaborador {
	
	// propriedades
	private double bonus = 0;

	public Gerente() {
		super();
	}

	public Gerente(String matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
		
		// metodos gets/sets
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	// metodos subsescritos da classe
	public double getSalario () {
		return super.getSalario() + getBonus();
	}
	

}
