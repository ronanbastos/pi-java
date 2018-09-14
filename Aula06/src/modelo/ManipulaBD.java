package modelo;

import java.sql.*;

import javax.swing.JOptionPane;

public class ManipulaBD {
	Conexao cn = new Conexao();
	
	public void Login(String u,String s) {
		cn.Conecta();
		//executeQuery so serve para select e preciso um resultSet
		//Para todos as outro use o update sem requerimento do resultSet
		// Os outro inset into,delete,update
		// O execute query retorna um array
		// O execute update retorna inteiro 
		try {
		Statement st = cn.con.createStatement(); //paramento do banco
		ResultSet rs = st.executeQuery("SELECT*FROM  usuario WHERE usuario='"+ u +"' AND senha='"+ s +"';");
		while(rs.next()) {
		JOptionPane.showMessageDialog(null,"Usuario Logado!!!");	
		}
		st.close();
		rs.close();
		}catch(SQLException e){
		System.out.println("Erro,login:" + e);
	
	}
 }


}