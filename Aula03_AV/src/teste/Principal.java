package teste;
import java.util.*;
import javax.swing.*;

public class Principal {
	
	 static String Cxc[] = new String[21];
	 static int w = 1;
	 static int i = 0;
	 static int op = 0;
	 static int s = 0;
	 static int vez = 20;
	 
 
 static Random r = new Random();
 
 public static void main(String[]args) {

	 
	 while(op!=4) {
		String escolha =
		JOptionPane.showInputDialog("ESCOLHA: \n"		 
		+ "1 - Gerar senha \n"		 
		+ "2 - Chamar senha Aleatoria\n"		 
		+ "3 - Chamar senha Sequencial \n "		 
		+ "4- sair"		 );
		 if(escolha.trim().equals("")) {
			 JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 03",0);
		 }else {
		op = Integer.parseInt(escolha);
		if(op==1) {
			
			
			 
			GeraSenha();	
				
		
			
		}		 
		if(op==2) {
			
			ChamaSenha_R();
			
		}		 
		if(op==3) {
			
			ChamaSenhaS();
		
		}		 
		
		 
	 }
	 
	
	 
 }
 }

 public static void GeraSenha() {
	 
	 
	 	if(i < vez) {
		Cxc[i] = String.valueOf(w);	
		System.out.println("SENHA: "+ Cxc[i]);	
		i++;
		w++;
		} else {
			
		System.out.println("Esgotou Limite de Senha!!");
			
		}
		 
	 }

 public static void ChamaSenha_R() {
	 int msg = r.nextInt(w);
	 while(msg != 0) {
		 System.out.println("Senha da Vez Aleatoria:" + msg);
	 break;
	 }
	 
 }
 public static void ChamaSenhaS() {
	 
	 if((s<w)&&(s<vez)) {
		 
		 System.out.println("Senha da Vez Sequencia:" + Cxc[s]);
		 s++;
	 }
	
	 
 }
	
}
