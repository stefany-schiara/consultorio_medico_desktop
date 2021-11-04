package br.com.consultorio.medico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import br.com.medsystem.connection.ConnectionFactory;
import br.com.medsystem.model.Paciente;

public class PacienteDao {

	public void insertPaciente(Paciente paciente) {

		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;		

		try {

			String sql = "INSERT INTO paciente (nome, dt_nascimento, cpf, email, telefone, celular, cep, logradouro, numero, complemento, estado, bairro) values(?,?,?,?,?,?,?,?,?,?,?,?)";

			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, paciente.getNome());
			stmt.setDate(2, convertToSqlDate(paciente));
			stmt.setString(3, paciente.getCpf());
			stmt.setString(4, paciente.getEmail());
			stmt.setString(5, paciente.getTelefone());
			stmt.setString(6, paciente.getCelular());
			stmt.setString(7, paciente.getCep());
			stmt.setString(8, paciente.getLogradouro());
			stmt.setString(9, paciente.getNumero());
			stmt.setString(10, paciente.getComplemento());
			stmt.setString(11, paciente.getEstado());
			stmt.setString(12, paciente.getBairro());

			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");

		} catch (Exception ex) {
			Logger.getLogger(PacienteDao.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
		
	}

	private java.sql.Date convertToSqlDate(Paciente paciente) {
		long timeInMilliSeconds = paciente.getDtNascimento().getTime();
		java.sql.Date dtNascimentoSql = new java.sql.Date(timeInMilliSeconds);
		return dtNascimentoSql;
	}

}
