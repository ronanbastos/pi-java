package visao;

import javax.swing.JOptionPane;
import modelo.ManipulaBD;

public class Menu {
	ManipulaBD mbd = new ManipulaBD();
	
	int op = 3;
	
	public void ChamaMenu() {
		
		while(op!=0) {
				String escolha =
				JOptionPane.showInputDialog("ESCOLHA: \n"		 
				+ "1 - login \n"		 
				+ "2 - Cadastre-se\n"			 
				+ "0 - sair"		 );
				 if(escolha.trim().equals("")) {
					 JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 06",0);
				 }else {
				op = Integer.parseInt(escolha);			
				switch(op) {
				case 1:chamalogin();break;
				case 2:Cadastro();break;
				case 0:System.exit(0);break;
				default:
					JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 06",0);
					break;
						   }
				 		}

					}
				}
	public void chamalogin() {
	String usu =	JOptionPane.showInputDialog("Informe USUARIO");
	String sen =	JOptionPane.showInputDialog("Informe SENHA");
	mbd.Login(usu, sen);
	ChamaMenu();
	}
	public void Cadastro() {
		
	}
		
	
}	
