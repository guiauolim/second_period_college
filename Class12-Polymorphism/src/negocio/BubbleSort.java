package negocio;

public class BubbleSort implements Ordenacao {

	public void ordenar(int[] vetor) {
		boolean continua = true;
		
		do {
			continua = false;

			for (int i = 0; i < (vetor.length - 1); i++) {
				if (vetor[i + 1] < vetor[i]) { 
					int temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					continua = true;
				}
			}
		} while (continua);
	}

}
