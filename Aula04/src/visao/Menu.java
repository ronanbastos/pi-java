package visao;
import javax.swing.JOptionPane;

public class Menu {
	int opcao = 4;
	String rascunho = "";
	String nome[] = new String[10];
	double media[] = new double[10];
	int i = 0;
	public void chamaMenu() {
		
		while(opcao > 0) {
		rascunho = JOptionPane.showInputDialog("Menu Escolar"+
			"\n1 - Cadastro"+
			"\n2 - Listagem"+
			"\n3 - Apagar"	+
			"\n0 - Sair");
		opcao = Integer.parseInt(rascunho);
		if(rascunho.trim().equals("")){
			JOptionPane.showMessageDialog(null,"Informe algum valor!!","aula04",0);
		}else{
			opcao = Integer.parseInt(rascunho);
		switch(opcao){
		case 0: System.exit(0);break;
		case 1:Cadastrar(); break;
		case 2: Listar(); break;
		case 3: Apagar(); break;
		default:
			JOptionPane.showMessageDialog(null,"Informe algum valor!!","aula04",0);
		break;
		    	}
			}
		}
		
	}
	public void Cadastrar() {
		nome[i] = JOptionPane.showInputDialog("");
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(""));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(""));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog(""));
		media[i] = (n1+n2+n3)/3;		
		JOptionPane.showMessageDialog(null,"nome:"+ nome[i]+"\nMedia:"+ media[i],"Resultado - aula04",1);
		i++;
	}
	public void Listar() {
		String rascunho = "";
		for(int x=0; x<i;x++) {
			if(nome[x].equals(null)) {
				
			}else {
				rascunho += nome[x].toLowerCase()+ "-" + media[x] + "\n";
			}
			JOptionPane.showMessageDialog(null,rascunho,"Listagem-Aula04",1);
		}
	}
	public void Apagar() {
		String rascunho = "escholha pelo ID: \n";
		for(int x=0; x<i;x++) {
			if(nome[x].equals("")) {
				
			}else {
				rascunho += "ID: " + x + "(" + nome[x] + "-" + media[x] + ")"+"\n";
			}
		 int id = Integer.parseInt(JOptionPane.showInputDialog(rascunho));
		nome[id]= "";
		media[id]=0.01;
		Listar();
	}
	
 }
}
