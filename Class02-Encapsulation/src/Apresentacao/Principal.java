package Apresentacao;

import java.util.Scanner;

import Negocio.Autor;
import Negocio.Livro;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Livro objLivro = new Livro();
		
		try {
			System.out.print(" Digite o titulo: ");
			objLivro.setTitulo(leitor.nextLine());
			
			System.out.print(" Digite o nome do Autor: ");
			objLivro.setObjAutor(new Autor(leitor.nextLine()));
			
			System.out.print(" Digite o gênero: ");
			objLivro.setGenero(leitor.nextLine());
			leitor.close();
			System.out.println("========================");
			
			System.out.println(" O título é: " + objLivro.getTitulo()  );
			System.out.println(" O nome do autor é: " + objLivro.getObjAutor().getNome());
			System.out.println(" O gênero do livro é: " + objLivro.getGenero());
			
		} catch ( Exception e) {
			System.out.println(e);
		}
		
			
    }
}
	

	


