package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Professor;

public class ProfessorDAO {
	// PROPRIEDADES
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS DA CLASSE
	public Collection<Professor> recuperarTodos () throws Exception {
		ArrayList<Professor> retorno = new ArrayList<Professor>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.Conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PROFESSOR");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Professor(objCursor.getInt("ID"), objCursor.getString("NOME"), objCursor.getString("TITULACAO")));
			
		} 
		
		objBanco.Desconectar();
		
		return retorno;
	}

}
