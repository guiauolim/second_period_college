package Negocio;

public class Cubo implements Solido {
	private double aresta = 0;

	
	public Cubo() {
		super();
	}

	public Cubo(double aresta) {
		super();
		this.aresta = aresta;
	}

	
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	// Metodos implementaos da interface
	
	public double calcularArea () {
		double calculo = 0;
		calculo = (6 * Math.pow(aresta, 2));
		return calculo;
	}


	public double calcularVolume() {
		double calculo = 0;
		calculo = (Math.pow(aresta, 3));
		return calculo	;
	}

}
