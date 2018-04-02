package Aulas33a36;

public class Telephone {
	public Telephone(String tipo, String ddd, String numero) {
		super();
		this.tipo = tipo;
		this.ddd = ddd;
		this.numero = numero;
	}
	private String tipo;
	private String ddd;
	private String numero;


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String toString(){
		
		return tipo + " " + ddd + " " + numero;
	}
	

}