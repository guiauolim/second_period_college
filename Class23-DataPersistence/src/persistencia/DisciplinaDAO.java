package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Disciplina;

public class DisciplinaDAO {
	// PROPRIEDADES	
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS DA CLASSE
	public Collection<Disciplina> recuperarTodos() throws Exception {
		ArrayList<Disciplina> retorno = new ArrayList<Disciplina>();
		BancoDeDados objBanco = new BancoDeDados();
		
		
		objBanco.Conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM DISCIPLINA");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Disciplina(objCursor.getInt("ID"), objCursor.getString("NOME")));
		}
		objBanco.Desconectar();
		
		return retorno;
	}

}
