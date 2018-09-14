package controle;

import java.io.*;

import javax.swing.JOptionPane;

public class Criar02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//conteudo
			String nome[] = new String[10];
			String content = JOptionPane.showInputDialog("");;
			
			//Criar arquivo
			File file = new File("C:\\JAVA\\ARQUIVOS\\teste.txt");
			
			//Se o arquivo nao existir, ele gera
			if (!file.exists()) {
				file.createNewFile();
				
			}
			//Prepara para escrever no arquivo
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			//Escrever e fecha  arquivo
			bw.write(content);
			bw.close();
			
			//le o arquivo
			FileReader ler = new FileReader("C:\\JAVA\\ARQUIVO\\teste.txt");
			BufferedReader reader = new BufferedReader(ler);
			String linha;
			while( (linha = reader.readLine()) != null){
				System.out.println(linha); 
			}
			// Imprime confirmaçao 
			System.out.println("Feito =D");
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
