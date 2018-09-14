package controle;

import java.io.*;
import java.util.*;


public class Criar01 {
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		int i,n;
		
		System.out.printf("Informe o numero para a tabuada:\n");
		n = ler.nextInt();
		
		FileWriter arq = new FileWriter("C:\\JAVA\\ARQUIVOS\\tabuada.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("+--Resultado--+%n");
		for (i=1;i<=10;i++) {
			gravarArq.printf("%2d X %2d |%n",i,n,(i*n));
		}
		gravarArq.printf("+---------------+%n");
	arq.close();
	System.out.printf("\nTabuada do %d foi gravada com sucesso em \"C:\\JAVA\\ARQUIVOS\\tabuada\".\n",n);
	ler.close();
		
		}

}
