package exercicio02;

import javax.swing.JOptionPane;

public class Menu {
	public int opcao = 3;
	public String resposta;
    public String nome;
	public void Exibe(){
	
        	
	//ArrayList<String> bandas = new ArrayList<String> ();	
	while(opcao != 0){	
	opcao =	Integer.parseInt(JOptionPane.showInputDialog("MENU: \n 1-Cadastrar Nome \n 2-Listar Nomes \n 0-Sair \n Qual é o seu opção?"));
	
	switch(opcao){	

	//case 1: nome = bandas.add(JOptionPane.showInputDialog("Cadastrar Nome \n  Digite um nome?")); break;
	case 2: JOptionPane.showMessageDialog(null,"Nome Cadastrado:" +nome); break;
	//case 0: JOptionPane.showMessageDialog(Arrays.toString( bandas.toArray() )); break;
	default:JOptionPane.showMessageDialog(null,"Opção invalida!"); break;
	
		}
	}
}
	public String Devolve() 
	{
		return resposta;
		
	}
}
