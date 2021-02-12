package negocio;

public class Novo extends Imovel {
	// propriedades
	private double adicional = 0;
	
	
    // metodos constutores
	public Novo() {
		super();
	}


	public Novo(String endereco, double metragem, double valor,double adicional) {
		super(endereco, metragem, valor);
		this.adicional = adicional;
	}
	

    // metodos gets/sets
	public double getAdicional() {
		return adicional;
	}


	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	// metodos subescritos da classe
	public double getValor () {
		return (super.getValor() + this.getAdicional());
	}

}
