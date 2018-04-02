package exerciciosAula36;

public class Telefone {
	
	private String tipo;
	private String ddd;
	private String numero;
	
	public Telefone(String tipo, String ddd, String numero){
		this.tipo = tipo;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public String toString(){
		String print = " ";
		if (tipo != null){
			print += tipo;
		} 
		if (ddd != null) {
			print+= ddd;
		}
		if (numero != null) {
			print += numero;
		}
		return print;
	}
}
