package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Produto;

public class ProdutoDAO {
	// PROPRIEDADES 
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	
	// METODOS DE EXECUCAO
	public Collection<Produto> recuperarTodos() throws Exception {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRODUTO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Produto(objCursor.getInt("ID"), 
					                objCursor.getString("NOME"), 
					                objCursor.getDouble("PRECO")));
		}
		
		objBanco.desconectar();		
		
		return retorno; 
	}
	
		
	

}
