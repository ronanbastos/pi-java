package visao;

import javax.swing.JOptionPane;

import modelo.ManipulaBD;

public class Menu {
	ManipulaBD mbd = new ManipulaBD();
 	public String usu = ""; 
	int op = 3;
	
	public void ChamaMenu() {
		while(op!=0) {
			String escolha =
			JOptionPane.showInputDialog("MENU: \n1 - Login \n2 - Cadastre-se\n0 - sair");
			if((escolha.equals(null)||escolha.trim().equals(""))) {
				 JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 07",0);
			}else {
				op = Integer.parseInt(escolha);			
				switch(op) {
					case 1:chamalogin();break;
					case 2:Cadastro();break;
					case 0:System.exit(0);break;
					default:
						JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 07",0);
						break;
				}
			}
		}
	}
	
	public void chamalogin() {
		usu =	JOptionPane.showInputDialog("Informe USUARIO");
		String sen =	JOptionPane.showInputDialog("Informe SENHA");
		mbd.Login(usu, sen);
		if(mbd.logado) {
			mbd.logado = false;
			ChamaLogado();
		}else {
			JOptionPane.showMessageDialog(null,"Não Logado!!","aula 07",0);
		}
	}
	
	public void Cadastro() {
		
	}
	
	public void ChamaLogado() {
		while(op!=0) {
			String escolha =
			JOptionPane.showInputDialog("Olá, " + usu + ": \n1 - XXX \n2 - YYY\n3 - LOGOUT\n0 - sair");
			if((escolha.equals(null)||escolha.trim().equals(""))) {
				 JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 07",0);
			}else {
				op = Integer.parseInt(escolha);			
				switch(op) {
					case 1://chamalogin();break;
					case 2://Cadastro();break;
					case 3:ChamaMenu();break;
					case 0:System.exit(0);break;
					default:
						JOptionPane.showMessageDialog(null,"Informaou Vazio!!","aula 07",0);
						break;
				}
			}
		}
	}
}
