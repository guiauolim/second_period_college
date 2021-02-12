package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import negocio.Aguia;
import negocio.Animal;
import negocio.Cachorro;
import negocio.Leorpado;

public class Principal {

	public static void main(String[] args) {
		// Declarção de variáveias
	 BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	
			
	
	String tipoAnimal = "";
	Animal objAnimal = null;
	// Entrada de dados
	
	try {
		// Menu de Ooções
		tipoAnimal = decidirMenuDeOpcoes(leitor);
		
		// Instanciar o objeto
		if (tipoAnimal.equalsIgnoreCase("C")) {
			objAnimal = new Cachorro();
		} else if (tipoAnimal.equalsIgnoreCase("L")) {
			objAnimal = new Leorpado();
		} else  {
			objAnimal = new Aguia();
		}
		
		// Peso do animal
				objAnimal.setPeso(lerDoubleDoTeclado(leitor, " Digite o peso do Animal: "));
				
				// Altura do Animal: 
				objAnimal.setAltura(lerDoubleDoTeclado(leitor, " Digite a altura do Animal: "));
				
				// Nome do Animal: 
				objAnimal.setNome(lerStringDoTeclado(leitor, " Digite o nome do Animal: "));
				
		
				if (tipoAnimal.equalsIgnoreCase("C")) {
					((Cachorro) objAnimal).setLitrosLeite(lerDoubleDoTeclado(leitor, " Digite a quantidade de litros: "));
					((Cachorro) objAnimal).setForcaMordida(lerDoubleDoTeclado(leitor, " Digite a força da medida: "));
				} else if (tipoAnimal.equalsIgnoreCase("L")) {
					((Leorpado) objAnimal).setLitrosLeite(lerDoubleDoTeclado(leitor, " Digite a quantidade de litros: "));
					((Leorpado) objAnimal).setVelocidade(lerDoubleDoTeclado(leitor, " Digite a velocidade: "));
				} else if (tipoAnimal.equalsIgnoreCase("A")) {
					((Aguia) objAnimal).setQuantidadeOvos(lerDoubleDoTeclado(leitor, " Digite a quantidade de ovos produzidos: "));
					((Aguia) objAnimal).setAutonomia(lerDoubleDoTeclado(leitor, " Digite a autonomia do voo: "));
				}
				
	} catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println("----------------------------------------------------------------------");
	// saida de dados
		System.out.println(" Nome do Animal: " + objAnimal.getNome());
		System.out.println(" Imc do Animal: " + objAnimal.calcularImc());
		if (tipoAnimal.equalsIgnoreCase("C")) {
	      ((Cachorro) objAnimal).morder();
		} else if (tipoAnimal.equalsIgnoreCase("L")) {
		  ((Leorpado) objAnimal).correr();
		} else if (tipoAnimal.equalsIgnoreCase("A")) {
	      ((Aguia) objAnimal).voar();
		}
		
}

	public static String decidirMenuDeOpcoes(BufferedReader leitor) throws Exception {
		String resultado = "";
		
		do {
			System.out.println("+=======================+");
			System.out.println("|     Menu de Opções    |");
			System.out.println("|     C -> Cachorro     |");
			System.out.println("|     L -> Leopardo     |");
			System.out.println("|     A -> Aguia        |");
			System.out.println("+=======================+");
			System.out.print(" Digite a opção desejada: ");
			resultado = leitor.readLine();
			
		} while ((! resultado.equalsIgnoreCase("C")) && (! resultado.equalsIgnoreCase("L")) && (! resultado.equalsIgnoreCase("A")));
		return resultado;
	}
	
	public static double lerDoubleDoTeclado( BufferedReader leitor, String instrucao) {
		double resultado = 0;
		
		do {
		try {
			System.out.print(instrucao);
			resultado = Double.parseDouble(leitor.readLine());
		} catch (Exception e) {
			System.out.println(" Não ta difícil. Digite um número aí arrombado!");
		}
		} while (resultado <= 0);
		return resultado;
	} 
	
	public static String lerStringDoTeclado( BufferedReader leitor, String instrucao)  throws Exception {
		String resultado = "";
	
			System.out.print(instrucao);
			resultado = leitor.readLine();
		
		return resultado;
		
	}
}	
