package Aulas33a36;

public class Fatorial {

	public static int fatorial (int num) {
		int total = 1;
		for(int i = num; i > 1 ; i--){
			total *= i;
		}
		return total;
	}
	
	public static int fatorialRec(int num){
		if (num == 0){
			return 1;
		}
		return num * fatorialRec(num - 1);
	}
	
}
