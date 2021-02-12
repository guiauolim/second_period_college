package negocio;

public class Usado extends Imovel {
	private double depreciacao = 0;
    
	// metodos construtores
	public Usado() {
		super();
	}

	public Usado(String endereco, double metragem, double valor, double depreciacao) {
		super(endereco, metragem, valor);
		this.depreciacao = depreciacao;
	}
    
	// metodos gets/sets
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	// metodos subsescritos
	public double getValor() {
		return (super.getValor() - this.depreciacao);
	}
	
	

}
