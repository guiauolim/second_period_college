package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = new Colaborador();
		Gerente objGerente = new Gerente();
		
		try {
			System.out.print(" Informe a matricula do Colaborador: ");
			objColaborador.setMatricula(leitor.readLine());
			System.out.print(" Informe a nome do Colaborador: ");
			objColaborador.setNome(leitor.readLine());
			System.out.print(" Informe a salário do Colaborador: ");
			objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
			
			System.out.print(" Informe o matricula do Gerente: ");
			objGerente.setMatricula(leitor.readLine());
			System.out.print(" Informe o nome do Gerente: ");
			objGerente.setNome(leitor.readLine());
			System.out.print(" Informe o salário do Gerente: ");
			objGerente.setSalario(Double.parseDouble(leitor.readLine()));
			System.out.println(" Informe o bonus: ");
			objGerente.setBonus(Double.parseDouble(leitor.readLine()));
		
			
		} catch (Exception erro) {
			System.out.println(erro);
		}	
			// saida 
		    System.out.println("--------------------------------");
			System.out.println(" Informações do colaborador: ");
			System.out.println(" Matricula: " + objColaborador.getMatricula());
			System.out.println(" Nome: " + objColaborador.getNome());
			System.out.println(" Salário: " + objColaborador.getSalario());
			System.out.println("--------------------------------");
			System.out.println(" Informações do gerente: ");
			System.out.println(" Matricula: " + objGerente.getMatricula());
			System.out.println(" Nome: " + objGerente.getNome());
			System.out.println(" Salário:  R$" + objGerente.getSalario());
			
		

	}

}
