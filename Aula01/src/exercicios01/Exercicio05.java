package exercicios01;

import java.util.Scanner;

public class Exercicio05 {
	public static String usuario;
	public static String senha;
	public static void main(String[] args) {
		
		/*
		 criar um login,sem acesso a bd
		 A aplicação irá solicitar usuario e senha;
		 Após a digitação informar se "logado" ou "usuario e/ou senha invalidos";
		 usario: aluno;
		 senha: 1234;
		*/
		Scanner digita = new Scanner(System.in);
		System.out.print("Informe usuario:");
		usuario = digita.next();
		System.out.println("Escolha Senha:");
		senha = digita.next();
		if(usuario.trim().equals("aluno")&&(senha.trim().equals("123"))){
			System.out.print("logado");
		}else{
			System.out.println("usuario ou senha errados");
		}
		digita.close();
}
	
}