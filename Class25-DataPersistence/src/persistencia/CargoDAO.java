package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cargo;

public class CargoDAO {
	// PRORPRIEDADES DA CLASSE
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	
	// METODOS DA CLASSE
	public Collection<Cargo> recuperarTodos() throws Exception {
		ArrayList<Cargo> retorno = new ArrayList<Cargo>();
		BancoDeDados objBanco = new BancoDeDados();	
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CRG_CARGO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Cargo (objCursor.getInt("CRG_ID"),
					               objCursor.getString("CRG_NOME"),
					               objCursor.getDouble("CRG_SALARIO")));
			
		
		}
		objBanco.desconectar();
		
		return retorno;
	}
	// METODOS PARA PERSISTIR
	public void persistir(Cargo objCargo) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();

		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CRG_CARGO" +
		                                                        "(CRG_NOME, CRG_SALARIO)" + 
				                                                "VALUES" + 
		                                                        "(?, ?)");
		
		objExecucao.setString(1, objCargo.getNome());
		objExecucao.setDouble(2, objCargo.getSalario());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}

}
