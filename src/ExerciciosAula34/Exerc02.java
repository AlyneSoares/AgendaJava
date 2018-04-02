package ExerciciosAula34;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean isFechado = false;

		Calculadora calculadora = new Calculadora();
		
		while(!isFechado) {
			System.out.print("Escolha seu método: \n " +
					"1. Somar; 2. Subtrair; 3. Multiplicar; 4. Dividir; 5. Potenciação \n");
			int metodo = scan.nextInt();

			System.out.println("Entre com os valores do cálculo");
			double valorA = scan.nextDouble();
			double valorB = scan.nextDouble();

			if (metodo == 1){
				System.out.println(calculadora.soma(valorA, valorB));
			}
			if (metodo == 2){
				System.out.println(calculadora.subtracao(valorA, valorB));
			}
			if (metodo == 3){
				System.out.println(calculadora.multiplicacao(valorA, valorB));
			}
			if (metodo == 4){
				System.out.println(calculadora.divisao(valorA, valorB));
			}
			if (metodo == 5){
				System.out.println(calculadora.potencia(valorA, valorB));
			}

			System.out.println("Fechar calculadora?");
			if (scan.next().equalsIgnoreCase("s")){			
				isFechado = true;
			}	

		}

	}
}
