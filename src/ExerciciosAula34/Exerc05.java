package ExerciciosAula34;

import java.util.Scanner;

import Aulas35.Fibonacci;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean isFechado = false;

		ConversorDeVolumes calculadora = new ConversorDeVolumes();

		while(!isFechado){

			System.out.println("Escolha seu método: \n " +
					"1. Litro em Centimetros³ 2. Metro³ em Litros 3. Metro³ em Pés³ 4.Galão Americano em Polegadas³ 5.Galão Americano em Litro");
			int metodo = scan.nextInt();

			System.out.println("Digite o valor da área");
			double valorA = scan.nextDouble();

			if(metodo == 1){
				System.out.println(valorA + " Litros = " + calculadora.litroToCentimetosCubico(valorA) + " Centimetros³");
			}
			if(metodo == 2){
				System.out.println(valorA + " Metro³ = " + calculadora.metroCubicoToLitro(valorA) + " Litros");
			}
			if(metodo == 3){
				System.out.println(valorA + " Metro³ = " + calculadora.metroCubicoToPesCubicos(valorA) + " Pés³");
			}
			if(metodo == 4){
				System.out.println(valorA + " Galão = " + calculadora.galaoAmericadoToPolegadaCubica(valorA) + " Polegada³");
			}
			if(metodo == 5){
				System.out.println(valorA + " Galão = " + calculadora.galaoAmericanoToLitros(valorA) + " Litros");
			}

			System.out.println("Fechar Calculadora?");
			if (scan.next().equalsIgnoreCase("s")){
				isFechado = true;
			}
		}
		
		
		ConversorTempo relogio = new ConversorTempo();

		while(!isFechado){

			System.out.println("Escolha seu método: \n " +
					"1. Mins em Segs  2. Horas em Min. 3. Dias em Horas 4. Semanas em Dias 5. Mes em Dias 6. Ano em Dias");
			int metodo = scan.nextInt();

			System.out.println("Digite o valor a ser convertido");
			double valorA = scan.nextDouble();

			if(metodo == 1){
				System.out.println(valorA + " Minutos = " + relogio.minutoEmSegundo(valorA) + " Segundos");
			}
			if(metodo == 2){
				System.out.println(valorA + " Horas = " + relogio.horaEmMinutos(valorA) + " Minutos");
			}
			if(metodo == 3){
				System.out.println(valorA + " Dias = " + relogio.diaEmHoras(valorA) + " Horas");
			}
			if(metodo == 4){
				System.out.println(valorA + " Semanas = " + relogio.semanaEmDias(valorA) + " Dias");
			}
			if(metodo == 5){
				System.out.println(valorA + " Mês = " + relogio.mesEmDias(valorA) + " Dias");
			}
			if(metodo == 6){
				System.out.println(valorA + " Ano = " + relogio.anoEmDias(valorA) + " Dias");
			}

			System.out.println("Fechar Calculadora?");
			if (scan.next().equalsIgnoreCase("s")){
				isFechado = true;
			}
		}
		
		
	}
}
