package ExerciciosAula34;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean isFechado = false;

		ConversaoDeArea calculadora = new ConversaoDeArea();

		while(!isFechado){

			System.out.println("Escolha seu método: \n " +
					"1. Metro² para Pés² 2.Pés² para Centímetro² 3.Milha² para Acre 4. Acre para Pés²");
			int metodo = scan.nextInt();

			System.out.println("Digite o valor da área");
			double valorA = scan.nextDouble();

			if(metodo == 1){
				System.out.println(valorA + " Metros² = " + calculadora.metroQuadEmPesQuadr(valorA) + " pés²");
			}
			if(metodo == 2){
				System.out.println(valorA + " Pés² = " + calculadora.peQuadradoEmCentimQuad(valorA) + " Centímetros²");
			}
			if(metodo == 3){
				System.out.println(valorA + " Milha² = " + calculadora.milhaQuadrEmAcres(valorA) + " Acres²");
			}
			if(metodo == 4){
				System.out.println(valorA + " Acre² = " + calculadora.acreEmPesQuadrados(valorA) + " Pés²");
			}
			
			System.out.println("Fechar Calculadora?");
			if (scan.next().equalsIgnoreCase("s")){
				isFechado = true;
			}
		}
	}
}
