package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Autor;

public class AutorDAO {
	// METODO PARA RECUPERAR OS AUTORES
	public Collection<Autor> recuperarTodos() throws Exception {
			ArrayList<Autor> retorno = new ArrayList<Autor>();
		
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar(); 
		
		PreparedStatement objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM AUTOR");
		ResultSet objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			retorno.add(new Autor(objCursor.getInt("ID"),objCursor.getString("NOME")));
		}
		
		objBanco.desconectar();
	
		return retorno;
		
	}

}
