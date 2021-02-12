package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

import negocio.BubbleSort;
import negocio.Direta;
import negocio.Inversa;
import negocio.Ordenacao;

public class Principal {

	public static void main(String[] args) {
		
		
		
		
		Ordenacao objOrdenacao = null;
		
		int [] vetor = new int[20];
		
		// entrada
		preencherVetor(vetor);
		 
		// processamento
		System.out.println("Vetor original: ");
		imprimirVetor(vetor);
		
		System.out.println("");
		System.out.println(Calendar.getInstance());
		objOrdenacao = new Direta();
		objOrdenacao.ordenar(vetor);
		
		imprimirVetor(vetor);
		
		objOrdenacao = new Inversa();
		objOrdenacao.ordenar(vetor);
		
		
		imprimirVetor(vetor);
		
		objOrdenacao = new BubbleSort();
		objOrdenacao.ordenar(vetor);
		
		imprimirVetor(vetor);

	}
	public static void preencherVetor (int [] vetor) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		boolean tentarNovamente = false;
		for (int i = 0; i < vetor.length ; i++) {
			do {
				try {
					System.out.print(" Informe o valor da posição " + i + " do vetor: ");
					vetor[i] = Integer.parseInt(leitor.readLine());
					tentarNovamente = false;
				} catch (Exception e) {
					System.out.println(" DIGITE UM NÚMERO!");
					tentarNovamente = true;
				   }
			} while (tentarNovamente);
			
		}
	}
	public static void imprimirVetor (int [] vetor) {
		for (int i = 0; i < vetor.length ; i++) {
			System.out.print(vetor[i] + "\t"	);
		}
		System.out.println("");
	}

}
