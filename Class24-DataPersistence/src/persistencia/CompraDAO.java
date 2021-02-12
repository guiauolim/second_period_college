package persistencia;

import java.sql.PreparedStatement;

import negocio.Compra;

public class CompraDAO {
	// PROPRIEDADES DA CLASSE
	private PreparedStatement objExecucao = null;
	
	// METODOS DA CLASSE
	public void persistir (Compra objCompra) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();	
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO COMPRA" + 
		                                                        "(IDPRODUTO, IDCLIENTE, DATA, QUANTIDADE)" +
				                                                "VALUES " +
		                                                        "(? , ?, ?, ?)");
		
		objExecucao.setInt(1, objCompra.getObjProduto().getId());
		objExecucao.setInt(2, objCompra.getObjCliente().getId());
		objExecucao.setString(3, objCompra.getDataEmFormatoParaBanco());
		objExecucao.setInt(4, objCompra.getQuantidade());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
	
	
		
	

}
