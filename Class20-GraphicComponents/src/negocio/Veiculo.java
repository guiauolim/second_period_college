package negocio;

public class Veiculo {
	private Fabricante objFabricante = null;
	private String modelo = "";
	private int cor = 0;
	private boolean tetoSolar = false;
	
	// METODOS CONSTRUTOR VAZIO
	public Veiculo() {
		super();
	}
	
	// METODOS CONSTRUTOR CHEIO
	public Veiculo(Fabricante objFabricante, String modelo, int cor, boolean tetoSolar) {
		super();
		this.objFabricante = objFabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.tetoSolar = tetoSolar;
	}
	
	// METODOS GETS/SETS
	public Fabricante getObjFabricante() {
		return objFabricante;
	}
	public void setObjFabricante(Fabricante objFabricante) {
		this.objFabricante = objFabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	// METODO DA CLASSE
	public String getNomeCor() {
		String retorno = "";
		
	switch(getCor()) {
			case 1 : 
				retorno = "Branco";
				break;
				
			case 2 : 
				retorno = "Preto";
				break;	
				
			case 3 : 
				retorno = "Cinza";
				break;	
				
			case 4 : 
				retorno = "Amarelo";
				break;
				
			case 5 : 
				retorno = "Vermelho";
				break;	
				
			case 6 : 
				retorno = "Verde";
				break;
				
			case 7 : 
				retorno = "Azul";
				break;	
			}
			
			return retorno;
	
		
	}

}
