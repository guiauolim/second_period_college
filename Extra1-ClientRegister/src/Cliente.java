

import java.util.Scanner;



public class Cliente extends Main {
	String n = "Guilherme Augusto";
	String e = "guiauolim@gmail.com";	
	String nome;
	String email;
	String salvar;
	String a = "";
	int idade;
	int valor;
	
	public String nome () {
		Scanner leitor = new Scanner(System.in);
		System.out.print(" Digite seu nome: ");
		nome = leitor.next();
		leitor.close();
		return nome;
		}
	
	public String email (String a) {
		
		return email;
	}
	
	public int idade (int valor) {
		System.out.println(valor);
		return idade;
		
	}
	public String salvar() {
		if (n.equals(nome))  {
			System.out.println(" Usu�rio cadastrado! ");	
		} else {
			System.out.println(" N�o foi poss�vel continuar a opera��o! ");
		}
		
		return salvar;
	}
	
	} 
	
	
	


