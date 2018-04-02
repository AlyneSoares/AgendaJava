package ExerciciosAula34;

public class Exerc01 {

	static void imprimirValor(){
		System.out.println(Contador.retornaContador());
	}
	public static void main(String[] args) {

		imprimirValor();

		Contador.retornaContador();

		imprimirValor();
		
		new Contador();
		
		imprimirValor();

		Contador.retornaContador();

		imprimirValor();

		Contador.zeraContador();

		imprimirValor();
		
		new Contador();
		new Contador();
		
		imprimirValor();
		
		Contador abc = new Contador();
		Contador bla = new Contador();
		
		imprimirValor();
		
	}

}
