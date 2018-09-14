package modelo;

import java.sql.*;


public class Conexao {
	public Connection con = null;
	String caminho = "jdbc:mysql://localhost:3306/aula06"; //no usbw usa localhost:3307.
	String usuario = "root";
	String senha = "";
	public void Conecta() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(caminho,usuario,senha);
		System.out.println("conectou :)");
	}catch(SQLException | ClassNotFoundException e){  //Exception é uma biblioteca de erro.
		System.out.println("ERRO, ao Conectar:"+ e);
	}
		
	}
	public void Desconecta() {
		try {
			con.close();
			System.out.println("DesConectou :(");
		}catch(SQLException e) {
			System.out.println("ERRO, ao Conectar:"+ e);
		}
	}
}
