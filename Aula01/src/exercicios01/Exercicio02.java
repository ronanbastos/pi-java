package exercicios01;

public class Exercicio02 {

	public static double valorA;
	public static double valorB;
	public static double resultado;
	
	public static void main(String[] args) {
		System.out.println(resultado);
		Soma();
		Subtracao();
		Divisao();
		Multiplicacao();
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
