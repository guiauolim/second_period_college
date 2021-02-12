package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cargo;
import negocio.Colaborador;

public class ColaboradorDAO {
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS DA CLASSE
	public Collection<Colaborador> recuperarTodos () throws Exception {
		ArrayList<Colaborador> retorno = new ArrayList<Colaborador>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CLB_COLABORADOR, CRG_CARGO" +
		                                                        "WHERE CLB_CRG_ID = CRG_ID");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Colaborador(objCursor.getInt("CLB_ID"), 
					                   new Cargo(objCursor.getInt("CRG_ID"),
					                		     objCursor.getString("CRG_NOME"),
					                		     objCursor.getDouble("CRG_SALARIO")),
			                                     objCursor.getString("CLB_NOME")));
		}
		objBanco.desconectar();
		
		return retorno;
	}
	// METODOS DA CLASSE
	public void persistir (Colaborador objColaborador) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CLB_COLABORADOR" +
		                                                        "(CLB_CRG_ID, CLB_NOME)" + 
				                                                "VALUES" +
		                                                        "(?, ?)");
		objExecucao.setInt(1, objColaborador.getObjCargo().getId());
		objExecucao.setString(2, objColaborador.getNome());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}

}
