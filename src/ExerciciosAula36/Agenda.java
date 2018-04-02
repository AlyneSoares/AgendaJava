package ExerciciosAula36;

public class Agenda {

	
	private String nome;
	private Contato[] contatos;
	
	public Agenda(String nomeDaAgenda){
		this.nome = nomeDaAgenda;
		this.contatos = new Contato[3];
	}
		
	public void addContato(int index, Contato contato){
		this.contatos[index] = contato;  
	}
	
	public String toString(){
		String print = "Agenda de " + nome + ": \n";
		for(Contato contato: contatos){
			print += contato;
		}
		return print;
	}
	

}
