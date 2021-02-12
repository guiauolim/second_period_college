package negocio;

public class Direta implements Ordenacao{
      // metodos implementados da interface
	public void ordenar(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {          // Do primeiro ao ultimo
			for ( int j = (i + 1); j < vetor.length ; j++ ) {    //do proximo ao ultimo      
				if (vetor[j] < vetor[i]) {                     // troca de valores entre duas variaveis          
					int temp = vetor[i];                            	
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		
		
	}
	
}	


