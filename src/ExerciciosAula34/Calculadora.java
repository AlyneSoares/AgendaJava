package ExerciciosAula34;

public class Calculadora {
	
	public double soma(double valorA, double valorB){
		return valorA + valorB;
	}
	
	public double subtracao(double valorA, double valorB){
		return valorA - valorB;
	}
	
	public double multiplicacao(double valorA, double valorB){
		return valorA * valorB;
	}
	
	public double divisao(double valorA, double valorB){
		return valorA / valorB;
	}
	
	public double potencia(double valorA, double valorB){
		return Math.pow(valorA, valorB);
	}
	
	public int fatorial(int numero) {
		if (numero == 1)
			return 1;
					
		return numero * fatorial(numero-1);
		
	}

}

