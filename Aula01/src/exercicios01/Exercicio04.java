package exercicios01;

import java.util.Scanner;

public class Exercicio04 {
	public static double valorA;
	public static double valorB;
	public static double resultado;
	
	public static void main(String[] args) {
		Scanner digita = new Scanner(System.in);
		int opcao;
		System.out.println("Escolha Opção:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicarção");
		System.out.println("____________________");
		System.out.println("Coloque sua opção aqui:");
		opcao = digita.nextInt();
		System.out.println("Opcao Escolhida:"+ opcao);
		double x;
		double y;
		
		switch(opcao) {
		case 1: 
			System.out.print("Valor A: ");
			 x = digita.nextDouble();
			System.out.print("Valor B: ");
			 y = digita.nextDouble();
			 System.out.print("Valor total:");
			 Soma(x,y); 
			break;
		case 2: 
			System.out.print("Valor A: ");
			 x = digita.nextDouble();
			System.out.print("Valor B: ");
			 y = digita.nextDouble();
			 System.out.print("Valor total:"); 
			Subtracao(x,y); 
			    	break;
		case 3: 
			System.out.print("Valor A: ");
			 x = digita.nextDouble();
			System.out.print("Valor B: ");
			 y = digita.nextDouble();
			 System.out.print("Valor total:");
			  
			Divisao(x,y); 
				break;
		case 4: 
			System.out.print("Valor A: ");
			 x = digita.nextDouble();
			System.out.print("Valor B: ");
			 y = digita.nextDouble();
			 System.out.print("Valor total:");
			 
			Multiplicacao(x,y); 
				break;
		default :break;
		}
		digita.close();
	}
		public static void Soma(double x,double y) {
		 valorA = x;
		 valorB = y;
		 resultado = valorA + valorB;
		 System.out.println(resultado);
		}
		public static void Subtracao(double x,double y) {
			valorA = x;
			 valorB = y;
			 resultado = valorA - valorB;
			 System.out.println(resultado);

		}
		public static void Divisao(double x,double y) {
			valorA = x;
			 valorB = y;
			 resultado = valorA / valorB;
			 System.out.println(resultado);

		}
		public static void Multiplicacao(double x,double y) {
			valorA = x;
			 valorB = y;
			 resultado = valorA * valorB;
			 System.out.println(resultado);
			
	}

	
	

}