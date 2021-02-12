package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Negocio.Cilindro;
import Negocio.Cubo;
import Negocio.Piramide;
import Negocio.Solido;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in)); 
		
		Solido objSolido = null;
		String opcao = "";
		
		// entrada
		try {
			opcao = definirMenu(leitor);
			if (opcao.equalsIgnoreCase("1")) {
				objSolido = new Cubo();
				System.out.print(" Informe a aresta: ");
				((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
			} else if  (opcao.equalsIgnoreCase("2")) {
			objSolido = new Piramide();
			System.out.print(" Informe a aresta: ");
			((Piramide) objSolido).setAresta(Double.parseDouble(leitor.readLine()));
		   } else {
			objSolido = new Cilindro();
			System.out.print(" Informe o raio: ");
			((Cilindro) objSolido).setRaio(Double.parseDouble(leitor.readLine()));
			System.out.print(" Informe a altura: ");
			((Cilindro) objSolido).setAltura(Double.parseDouble(leitor.readLine()));
		   }
		} catch (Exception e) {
			System.out.println(e);
		}
		// saida de dados
		System.out.println("----------------------------------------------------------");
		System.out.println(" A area total do sólido escolhido é: " + objSolido.calcularArea());
		System.out.println(" A volume total do sólido escolhido é: " + objSolido.calcularVolume());
		
		
		
		
		
		

	}
	public static String definirMenu (BufferedReader leitor) {
		String opcaoDesejada = " ";
		do {
			try {
				System.out.println("===============");
				System.out.println("| 1 - CUBO     |");
				System.out.println("| 2 - PIRAMIDE |");
				System.out.println("| 3 - CILINDRO |");
				System.out.print(" Escolha a opção desejada: ");
				opcaoDesejada = leitor.readLine();
			} catch (Exception e) {
				System.out.println(e);
			}
		} while ((! opcaoDesejada.equalsIgnoreCase("1")) && (! opcaoDesejada.equalsIgnoreCase("2")) && (! opcaoDesejada.equalsIgnoreCase("3")));
		return opcaoDesejada;
	}

}
