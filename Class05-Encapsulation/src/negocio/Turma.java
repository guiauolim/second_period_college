package negocio;

public class Turma {
	// Propriedades
	private Cadeira objCadeira = null;  
	private Professor objProfessor = null;
	private String letra = "";
	private Aluno[] colecao = new Aluno[60];
	private int quantidadeAluno = 0;
	
	// metodos construtores
	public Turma() {
		super();
	}
	public Turma(Cadeira objCadeira, Professor objProfessor, String letra, Aluno[] colecao, int quantidadeAluno) {
		super();
		this.objCadeira = objCadeira;
		this.objProfessor = objProfessor;
		this.letra = letra;
		this.colecao = colecao;
		this.quantidadeAluno = quantidadeAluno;
	}
	
	// metodos gets/sets
	
	public Cadeira getObjCadeira() {
		return objCadeira;
	}
	public void setObjCadeira(Cadeira objCadeira) {
		this.objCadeira = objCadeira;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Aluno[] getColecao() {
		return colecao;
	}
	public void setColecao(Aluno[] colecao) {
		this.colecao = colecao;
	}
	public int getQuantidadeAluno() {
		return quantidadeAluno;
	}
	public void setQuantidadeAluno(int quantidadeAluno) {
		this.quantidadeAluno = quantidadeAluno;
	}
	
	
	// metodos da classe
	
	public void adicionarAluno (Aluno objAluno) {
		if (getQuantidadeAluno() < colecao.length) {
			colecao[getQuantidadeAluno()] = objAluno;
			quantidadeAluno++;
		}
	}
	public String listarAluno() {
		String retorno = "";
		
		for (int i = 0; i < getQuantidadeAluno() ; i++) {
			retorno += colecao[i].getMatricula() + "\t" + colecao[i].getNome() + "\r\n";
		}
		return retorno;
	}

}
