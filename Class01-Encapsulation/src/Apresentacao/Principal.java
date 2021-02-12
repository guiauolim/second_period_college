package Apresentacao;

import negocio.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// Sintaxe padarao instanciar o objeto
		Pessoa objeto1 = new Pessoa();
			objeto1.setNome(" Guilherme ");
			objeto1.setEndereco(" Scrn 704/705 ");
			objeto1.setTelefone(5451515);
			
			System.out.println(objeto1.getNome() + " " + objeto1.getEndereco() + " " + objeto1.getTelefone());
			
			
			System.out.println(" ");
			
			Pessoa objeto2 = new Pessoa(" Gabriel " , " SQNW 309 " , 355654615);
			System.out.println(objeto2.getNome() + " " + objeto2.getEndereco() + " " + objeto2.getTelefone());
			
		}
	
	
	
	
	
	

	}


