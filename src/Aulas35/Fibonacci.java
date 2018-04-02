package Aulas35;

public class Fibonacci {

	public static int fibonacci (int posicao){
		if (posicao < 2){
			return 1;
		}
		return fibonacci(posicao - 1) + fibonacci (posicao - 2);

	}
	
	

}
