package negocio;

public class OldFashion extends Drink implements Mixer{

	
	public void misturar() { 
		adicionar(new Ingrediente("Whiskey",  100,   " ml"));
		adicionar(new Ingrediente("Laranja",  0.25 , " fatia"));
		adicionar(new Ingrediente("A�ucar",   1,     " torr�o"));
		adicionar(new Ingrediente("Bailey�s", 25,    " ml"));
		
		
	}

}
