package exercicios01;

import java.util.Scanner;

public class Exercicio03 {
	public static double valorA;
	public static double valorB;
	public static double resultado;
	
	public static void main(String[] args) {
		Scanner digita = new Scanner(System.in);
		int opcao;
		System.out.println("Escolha Op��o:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Divis�o");
		System.out.println("4 - Multiplicar��o");
		System.out.println("____________________");
		System.out.println("Coloque sua op��o aqui:");
		opcao = digita.nextInt();
		System.out.println("Opcao Escolhida:"+ opcao);
		
		switch(opcao) {
		case 1: Soma(); 
			break;
		case 2: Subtracao(); 
				break;
		case 3: Divisao(); 
					break;
		case 4: Multiplicacao(); 
						break;
		default :break;
		}
		digita.close();
	}
		public static void Soma() {
		 valorA = 10;
		 valorB = 15;
		 resultado = valorA + valorB;
		 System.out.println(resultado);
		}
		public static void Subtracao() {
			valorA = 10;
			 valorB = 15;
			 resultado = valorA - valorB;
			 System.out.println(resultado);

		}
		public static void Divisao() {
			valorA = 10;
			 valorB = 20;
			 resultado = valorA / valorB;
			 System.out.println(resultado);

		}
		public static void Multiplicacao() {
			valorA = 10;
			 valorB = 15;
			 resultado = valorA * valorB;
			 System.out.println(resultado);
			
	}

	
	

}
