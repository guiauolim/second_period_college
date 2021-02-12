import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principal {
	
	public static void main(String[] args) {
		Empregado objEmpregado = new Empregado();
	
		
		 
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Digite o seu salário mensal: " );
		objEmpregado.setSalaryMon(Double.parseDouble(leitor.readLine()));
		System.out.println("Digite seu nome: ");
		objEmpregado.setName(leitor.readLine());
		System.out.println("Digite seu sobrenome: ");
		objEmpregado.setSurname(leitor.readLine());
		
		
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println(" /t/t Dados do Funcionário /t/t");
		System.out.println("Nome: " + objEmpregado.getName() + " " + objEmpregado.getSurname());
		System.out.println("O seu salario mensal: " + objEmpregado.getSalaryMon());
		System.out.println("O seu salario anual: " + objEmpregado.salaryYear());
		System.out.println("O seu salario anual com aumento de 10%: " + objEmpregado.taxa());
		
		
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		
	}
	

}
