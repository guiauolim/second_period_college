package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Turma objTurma = new Turma();
		Professor objProfessor = new Professor();
		Aluno objAluno = new Aluno();
		
		// Entrada de dados
		try {
			// nome da cadeira
			System.out.print(" Informe o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(leitor.readLine()));
			
			// nome do professor
			System.out.print(" Informe o nome do Professor: ");
			objProfessor.setNome(leitor.readLine());
			
			// título de professor
			System.out.print(" Informe o titulo do Professor: ");
			objProfessor.setTitulo(leitor.readLine());
			// salário do professor
			do {
				try {
			System.out.print(" Digite o sálario do Professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));
				} catch (Exception e) {
					System.out.println(" Somente números! E maior que 0");
				}
			} while (objProfessor.getSalario() <= 0);
			// letra da turma
			System.out.print(" Digite a letra da turma: ");
			objTurma.setLetra(leitor.readLine());
			
			// colocar o professor na turma
			objTurma.setObjProfessor(objProfessor);
		
			do {
				objAluno = new Aluno();
				// Mmatricula do aluno
				System.out.print(" Informe a matricula do aluno: ");
				objAluno.setMatricula(leitor.readLine());
				// nome do aluno
				System.out.print(" Informe o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				
				// adicionar aluno na turma
				objTurma.adicionarAluno(objAluno);
				
				System.out.print(" Digite <S> se tiver mais aluno, ou qualquer coisa para sair!");
			} while (leitor.readLine().equalsIgnoreCase("S"));
		} catch (Exception erro) {
			System.out.println(erro);
		}
		// Saida de dados
		System.out.println("----------------------------");
		System.out.println(" Cadeira: " + objTurma.getObjCadeira().getCadeira());
		System.out.println(" Turma: " + objTurma.getLetra());
		System.out.println(" Professor: " + objTurma.getObjProfessor().getNome() + " " + objTurma.getObjProfessor().getTitulo());
		System.out.println(" Salário: " + objTurma.getObjProfessor().getSalario());
		System.out.println(" Alunos: ");
		System.out.println(objTurma.listarAluno());
		
				

	}

}
