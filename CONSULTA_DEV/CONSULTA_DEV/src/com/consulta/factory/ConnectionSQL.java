package com.consulta.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {

	private static final String USUARIO = "admin";
	private static final String SENHA = "admin";
	private static final String URL = "jdbc:jtds:sqlserver://DESKTOP-92M5343/NotasSystemDB";
	
		public static Connection ConexaoSQL() throws SQLException {
			try {
				Class.forName("net.sourceforge.jtds.jdbc.Driver");
				return DriverManager.getConnection(URL, USUARIO, SENHA);
			}
			catch (ClassNotFoundException e) {
				throw new SQLException(e.getMessage());
			}		
		}
		public static void main(String[] args) throws SQLException {
			Connection connection = ConnectionSQL.ConexaoSQL();
			System.out.println("Conectado");
		}
	
}
