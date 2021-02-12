package persistencia;

import java.sql.PreparedStatement;

import negocio.Turma;

public class TurmaDAO {
	// PROPRIEDADES
	private PreparedStatement objExecucao = null;
	
	// METODOS DA CLASSE
	public void persistir (Turma objTurma) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.Conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO TURMA" +
		                                                        "(IDDISCIPLINA, IDPROFESSOR, LETRA)" +
				                                                "VALUES" + 
		                                                        "(?,?,?)");
		
		objExecucao.setInt(1, objTurma.getObjDisciplina().getId());
		objExecucao.setInt(2, objTurma.getObjProfessor().getId());
		objExecucao.setString(3, objTurma.getLetra());
		
		objExecucao.executeUpdate();		
	}

}
