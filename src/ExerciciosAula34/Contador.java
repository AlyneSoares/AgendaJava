package ExerciciosAula34;

public class Contador {

	public static int contador;
	
	/* Para incrementar o Contador a cada vez que chamar a classe (instanciar
	 * uso como forma de incremento o nome da própria classe, assim, cada vez que 
	 * for instanciada, automaticamente o contador receberá +1 no valor */
	public Contador(){
		contador++;
	}

	public static void zeraContador(){
		contador = 0;
	}

	public static int retornaContador(){
		return contador; 
	}

}
