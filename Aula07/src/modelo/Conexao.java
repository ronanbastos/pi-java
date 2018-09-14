package modelo;
import java.sql.*;

import visao.Menu;

public class Conexao {

public static void main(String[] args) {
	
	Menu mn = new Menu();
	mn.chamalogin();
 	

}
	public Connection con = null;
	String caminho = "jdbc:mysql://localhost:3306/aula06"; //no usbw usa localhost:3307.
	String usuario = "root";
	String senha = "";
	
	public void Conecta() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(caminho,usuario,senha);
			//System.out.println("conectou");
			
		}catch(SQLException|ClassNotFoundException err) {
			System.out.println("Erro ao conectar:"+ err);
		}
	}
	public void Desconecta() {
		
	}
}
