package negocio;

public class Caipirinha extends Drink implements Mixer{
    public void misturar() {	
    	adicionar(new Ingrediente("Cacha�a", 50, " ml"));
    	adicionar(new Ingrediente("Lim�o",   2,  " colheres"));
    	adicionar(new Ingrediente("A�ucar",  3,  " Colheres"));
    	adicionar(new Ingrediente("Gelo",    5,  " Pedras"));
	}
    
	
	

}
