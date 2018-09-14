package modelo;

import java.sql.*;

import javax.swing.JOptionPane;

import visao.TelaInicial;

public class ManipulaBD {
	Conexao cn = new Conexao();
	public boolean logado = false;
	
	public void Cadastro(String n,String e) {
		cn.Conecta();
		//executeQuery so serve para select e preciso um resultSet
		//Para todos as outro use o update sem requerimento do resultSet
		// Os outro inset into,delete,update
		// O execute query retorna um array
		// O execute update retorna inteiro 
		try {
		Statement st = cn.con.createStatement(); //paramento do banco
		st.executeUpdate("INSERT INTO cadastro (nome,email) VALUES" +
		"('"+ n +"','"+ e +"')");
		
		st.close();
		cn.Desconecta();
		JOptionPane.showConfirmDialog(null,"Cadastrado Com Sucesso!!");
		TelaInicial tela = new TelaInicial();
		tela.setVisible(true);
		}catch(SQLException err){
		System.out.println("Erro,login:" + err);
	
	}
 }


}