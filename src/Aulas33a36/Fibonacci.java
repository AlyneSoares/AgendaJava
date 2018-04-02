package Aulas33a36;

public class Fibonacci {
	
	public static int fibonacci(int posicao){
		if (posicao == 1 || posicao == 0){
			return posicao;
		}
		return fibonacci(posicao-1) + fibonacci(posicao-2);

	}
}