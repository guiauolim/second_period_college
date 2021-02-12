package negocio;

public class Drink {
	// propriedades
	
	private Ingrediente[] colecao = new Ingrediente[8];
	private int qtdIngredientes = 0;
	
	// metodos construtores
	public Drink() {
		super();
	}
	public Drink(Ingrediente[] colecao, int qtdIngredientes) {
		super();
		this.colecao = colecao;
		this.qtdIngredientes = qtdIngredientes;
	}
	// metodos gets/sets
	public Ingrediente[] getColecao() {
		return colecao;
	}
	public void setColecao(Ingrediente[] colecao) {
		this.colecao = colecao;
	}
	public int getQtdIngredientes() {
		return qtdIngredientes;
	}
	public void setQtdIngredientes(int qtdIngredientes) {
		this.qtdIngredientes = qtdIngredientes;
	}
	
	// metodos da classe
	public void adicionar (Ingrediente objIngrediente) {
		if (qtdIngredientes < colecao.length) {
			colecao[qtdIngredientes] = objIngrediente;
			qtdIngredientes++;
		}
	}
	public String beber() {
		String acao = "";
		acao = "Aproveite o seu drink formado por: \r\n";
		for (int i = 0; i < getQtdIngredientes(); i++) {
			acao += colecao[i].getQuantidade() + colecao[i].getUnidade() + " de " + colecao[i].getNome() + "\r\n";	
		}
		return acao;


}
}