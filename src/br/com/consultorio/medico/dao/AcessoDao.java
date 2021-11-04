package br.com.consultorio.medico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.sistema.consultorio.connection.ConnectionFactory;

/**
 *
 * @author esqui
 */
public class AcessoDao {	

	public boolean checkLogin(String usuario, String senha) {
		
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		boolean check = false;
		
		try {						
			
			stmt = conn.prepareStatement("SELECT * FROM acesso where usuario = ? and senha = ?");
			stmt.setString(1, usuario);
			stmt.setString(2, senha);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				check = true;
			}
			
		} catch (Exception ex) {
			Logger.getLogger(AcessoDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
		
		return check;
	}

}
