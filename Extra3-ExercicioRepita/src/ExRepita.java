import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExRepita {
	public static int DefinirOpcao () {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		int n;
		
		do {
			try {
			System.out.println(" Digite um n�mero: ");
			n = Integer.parseInt(leitor.readLine());
			} catch (Exception e) {
				System.out.println("Somente caracteres n�mericos! ");
			}
		} while ( n != 0);
		return n;
	}
	
			
	public static void main(String[] args) {
		
	

	}

}
